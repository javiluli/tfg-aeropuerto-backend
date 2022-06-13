package com.aeropuerto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aeropuerto.models.dto.PasajeroDTO;
import com.aeropuerto.models.dto.PasajerosByReservaDTO;
import com.aeropuerto.services.IPasajeroService;

@RestController
@CrossOrigin("*")
@RequestMapping("/pasajeros")
public class PasajeroController {

    @Autowired
    private IPasajeroService iPasajeroService;

    @PostMapping("/pasajeros")
    private ResponseEntity<String> insertPasajero(@RequestBody PasajeroDTO pasajeroDto) {
	iPasajeroService.savePasajeroDto(pasajeroDto);
	return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    private ResponseEntity<List<PasajerosByReservaDTO>> findPasajeroByIdReserva(@PathVariable(name = "id") String idReserva) {
	return new ResponseEntity<List<PasajerosByReservaDTO>>(iPasajeroService.findPasajerosByIdReserva(idReserva), HttpStatus.OK);
    }

}
