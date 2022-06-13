package com.aeropuerto.controllers;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aeropuerto.entitys.Reserva;
import com.aeropuerto.models.dto.PasajeroDTO;
import com.aeropuerto.models.dto.ReservaDTO;
import com.aeropuerto.models.dto.ReservaDTOBusquedaCheckin.ReservaDTO_Busqueda_Checkin;
import com.aeropuerto.services.IPasajeroService;
import com.aeropuerto.services.IReservaService;
import com.aeropuerto.services.IVueloService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

@RestController
@CrossOrigin("*")
public class ReservaController {

    @Autowired
    private IReservaService iReservaService;

    @Autowired
    private IPasajeroService iPasajeroService;

    @Autowired
    private IVueloService iVueloService;

    @SuppressWarnings("unchecked")
    @PostMapping("/reservas")
    private ResponseEntity<String> insertReserva(@RequestBody ObjectNode json) {
	ObjectMapper jsonObjectMapper = new ObjectMapper();
	ReservaDTO reserva = null;
	List<PasajeroDTO> pasajeros = null;

	try {
	    // se obtienen los datos de la peticion dividica por el nopmbre del objeto
	    reserva = jsonObjectMapper.treeToValue(json.get("reserva"), ReservaDTO.class);
	    pasajeros = jsonObjectMapper.treeToValue(json.get("pasajeros"), ArrayList.class);
	} catch (JsonProcessingException | IllegalArgumentException e) {
	    e.printStackTrace();
	}

	iReservaService.saveReservaDto(reserva);

	// se mapea el objeto obtenido en la peticion
	ModelMapper modelMapper = new ModelMapper();
	for (int i = 0; i < pasajeros.size(); i++) {
	    PasajeroDTO pasajero = modelMapper.map(pasajeros.get(i), PasajeroDTO.class);
	    iPasajeroService.savePasajeroDto(pasajero);
	}

	// no me gusta, pero por ahora comple su funcion
	iVueloService.updatePlazasOcupadasFromVuelo(reserva.getIdVuelo(), pasajeros.size());

	return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/reserva/{id}")
    private ResponseEntity<String> eliminarReservaByIdReserva(@PathVariable(name = "id") String idReserva) {
	Reserva reserva = iReservaService.findPasajeroByIdReserva(idReserva);
	iReservaService.eliminarReservaByIdReserva(reserva.getIdReserva());
	iVueloService.updatePlazasOcupadasMenosFromVuelo(reserva.getVuelo().getIdVuelo());
	return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/reserva/{id}")
    private ResponseEntity<ReservaDTO_Busqueda_Checkin> findReservaByIdReserva(@PathVariable(name = "id") String idReserva) {
	return new ResponseEntity<ReservaDTO_Busqueda_Checkin>(iReservaService.findReservaByIdReserva(idReserva), HttpStatus.OK);
    }

}
