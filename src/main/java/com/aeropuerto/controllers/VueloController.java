package com.aeropuerto.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aeropuerto.entitys.Escala;
import com.aeropuerto.entitys.ModeloAvion;
import com.aeropuerto.entitys.Vuelo;
import com.aeropuerto.models.dto.VueloDTO;
import com.aeropuerto.services.IEscalaService;
import com.aeropuerto.services.IModeloAvionService;
import com.aeropuerto.services.IVueloService;

@RestController
@CrossOrigin("*")
public class VueloController {

    @Autowired
    private IVueloService iVueloService;

    @Autowired
    private IEscalaService iEscalaService;

    @Autowired
    private IModeloAvionService modeloAvionService;

    @GetMapping("/vuelosBySalidaAndLlegada")
    public ResponseEntity<List<VueloDTO>> findVuelosBy(@RequestParam String origen, @RequestParam String destino, @RequestParam String fechaSalida, @RequestParam String horaSalida) {
	VueloDTO vueloDto = null;
	List<Vuelo> lVuelos = iVueloService.findVuelosBy(origen, destino, fechaSalida, horaSalida);
	List<VueloDTO> lVueloDto = new ArrayList<>();
	Escala escala = null;
	ModeloAvion modeloAvion = null;

	for (Vuelo vuelo : lVuelos) {
	    vueloDto = new VueloDTO();

	    vueloDto.setVuelo(vuelo);
	    escala = iEscalaService.findEscalasByIdPrograma(vuelo.getPrograma().getIdPrograma());

	    vueloDto.setCantidadEscalas("0");
	    if (escala != null) {
		vueloDto.setCantidadEscalas(escala.getNumeroEscala());
	    }

	    modeloAvion = modeloAvionService.findModelosAvionByNombreModelo(vuelo.getAvion().getModeloAvion().getNombreModelo());

	    int plazasLibres = modeloAvion.getCapacidad() - vuelo.getPlazasOcupadas();
	    vueloDto.setPlazasLibres(plazasLibres);

	    lVueloDto.add(vueloDto);
	}

	return new ResponseEntity<List<VueloDTO>>(lVueloDto, HttpStatus.OK);
    }

}
