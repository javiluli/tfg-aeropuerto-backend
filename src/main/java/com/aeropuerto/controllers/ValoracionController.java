package com.aeropuerto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aeropuerto.entitys.Valoracion;
import com.aeropuerto.services.IValoracionService;

@RestController
@CrossOrigin("*")
@RequestMapping("/valoraciones")
public class ValoracionController {

    @Autowired
    private IValoracionService iValoracionService;

    @GetMapping("/all")
    public ResponseEntity<List<Valoracion>> findAllValoraciones() {
	return new ResponseEntity<List<Valoracion>>(iValoracionService.findAllValoraciones(), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Valoracion> save(@RequestBody Valoracion valoracion) {
	return new ResponseEntity<Valoracion>(iValoracionService.save(valoracion), HttpStatus.OK);
    }
}
