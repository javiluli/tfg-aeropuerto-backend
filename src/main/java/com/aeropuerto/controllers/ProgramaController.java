package com.aeropuerto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aeropuerto.entitys.Programa;
import com.aeropuerto.services.IProgramaService;

@RestController
@CrossOrigin("*")
@RequestMapping("/programas")
public class ProgramaController {

    @Autowired
    private IProgramaService iProgramaService;

    @GetMapping("/all")
    public ResponseEntity<List<Programa>> findAll() {
	return new ResponseEntity<List<Programa>>(iProgramaService.findAll(), HttpStatus.OK);
    }

}
