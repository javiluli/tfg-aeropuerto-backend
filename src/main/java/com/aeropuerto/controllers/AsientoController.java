package com.aeropuerto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aeropuerto.models.dto.AsientoDTO;
import com.aeropuerto.services.IAsientoService;

@RestController
@CrossOrigin("*")
@RequestMapping("/asientos")
public class AsientoController {

    @Autowired
    private IAsientoService asientoService;

    @GetMapping("/{id}")
    public ResponseEntity<List<AsientoDTO>> findAsientosByNombreModelo(@PathVariable(name = "id") String nombreModelo) {
	return new ResponseEntity<List<AsientoDTO>>(asientoService.findAsientosByNombreModelo(nombreModelo),
		HttpStatus.OK);
    }

    @GetMapping("/{numeroFila}/{nombreModelo}")
    public ResponseEntity<List<String>> findLetraAsientoByNombreModeloAndNumeroFila(@PathVariable(name = "numeroFila") String numeroFila, @PathVariable(name = "nombreModelo") String nombreModelo) {
	return new ResponseEntity<List<String>>(asientoService.findLetraAsientoByNombreModeloAndNumeroFila(nombreModelo, numeroFila), HttpStatus.OK);
    }
}
