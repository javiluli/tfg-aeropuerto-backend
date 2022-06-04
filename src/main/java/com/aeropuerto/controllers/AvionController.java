package com.aeropuerto.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aeropuerto.entitys.Avion;
import com.aeropuerto.services.IAvionService;

@RestController
@CrossOrigin("*")
public class AvionController {

    @Autowired
    private IAvionService iAvionService;

}
