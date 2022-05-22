package com.aeropuerto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aeropuerto.entitys.Aeropuerto;
import com.aeropuerto.services.IAeropuertoService;

@RestController
@CrossOrigin("*")
public class AeropuertoController {

    @Autowired
    private IAeropuertoService aeropuertoService;

    @GetMapping("/aeropuertos")
    public ResponseEntity<List<Aeropuerto>> listarAeropuertos() {
	return new ResponseEntity<List<Aeropuerto>>(aeropuertoService.findAllAeropuertos(), HttpStatus.OK);
    }

}
