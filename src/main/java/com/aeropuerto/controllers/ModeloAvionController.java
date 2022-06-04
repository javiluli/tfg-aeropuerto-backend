package com.aeropuerto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aeropuerto.entitys.ModeloAvion;
import com.aeropuerto.services.IModeloAvionService;

@RestController
@CrossOrigin("*")
public class ModeloAvionController {

    @Autowired
    private IModeloAvionService modeloAvionService;

    @GetMapping("/modelo")
    public ResponseEntity<ModeloAvion> findModelosAvionByNombreModelo(@RequestParam String nombreModelo) {
	return new ResponseEntity<ModeloAvion>(modeloAvionService.findModelosAvionByNombreModelo(nombreModelo), HttpStatus.OK);
    }

    @GetMapping("/modelos")
    public ResponseEntity<List<ModeloAvion>> listarModelosAvion() {
	return new ResponseEntity<List<ModeloAvion>>(modeloAvionService.findAllModelosAvion(), HttpStatus.OK);
    }

}
