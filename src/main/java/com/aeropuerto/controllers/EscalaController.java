package com.aeropuerto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aeropuerto.entitys.Escala;
import com.aeropuerto.services.IEscalaService;

@RestController
@CrossOrigin("*")
public class EscalaController {

    @Autowired
    private IEscalaService iEscalaService;

    @GetMapping("/escalas")
    public ResponseEntity<List<Escala>> listarEscalas() {
	return new ResponseEntity<List<Escala>>(iEscalaService.findAllEscalas(), HttpStatus.OK);
    }


    @GetMapping("/cantidadEscalasByIdPrograma")
    public ResponseEntity<Escala> cantidadEscalasByIdPrograma(@RequestParam String idPrograma) {
	return new ResponseEntity<Escala>(iEscalaService.findEscalasByIdPrograma(idPrograma), HttpStatus.OK);
    }
}
