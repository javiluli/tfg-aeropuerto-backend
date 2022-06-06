package com.aeropuerto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.aeropuerto.entitys.Fila;
import com.aeropuerto.services.IFilaService;

@RestController
@CrossOrigin("*")
public class FilaController {

    @Autowired
    private IFilaService filaService;

    @GetMapping("/filas/{id}")
    public ResponseEntity<Fila> obtenerMaxNumeroFilaYCantidadAsientosByNombreModelo(@PathVariable(name = "id") String nombreModelo) {
	return new ResponseEntity<Fila>(filaService.obtenerMaxNumeroFilaYCantidadAsientosByNombreModelo(nombreModelo), HttpStatus.OK);
    }

}
