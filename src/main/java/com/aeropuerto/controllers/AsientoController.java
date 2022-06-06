package com.aeropuerto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aeropuerto.entitys.Asiento;
import com.aeropuerto.services.IAsientoService;

@RestController
@CrossOrigin("*")
public class AsientoController {

    @Autowired
    private IAsientoService asientoService;

    @GetMapping("/asientos")
    public ResponseEntity<List<Asiento>> listarAsientos() {
	return new ResponseEntity<List<Asiento>>(asientoService.findAllAsientos(), HttpStatus.OK);
    }

}
