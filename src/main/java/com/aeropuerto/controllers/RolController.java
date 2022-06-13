package com.aeropuerto.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.aeropuerto.entitys.Rol;
import com.aeropuerto.services.IRolService;

@RestController
@CrossOrigin("*")
public class RolController {

    @Autowired
    private IRolService iRolService;

    @GetMapping("/rol/{id}")
    public ResponseEntity<Rol> findRolByIdRol(@PathVariable(name = "id") String idRol) {
	return new ResponseEntity<Rol>(iRolService.findRolByIdRol(idRol), HttpStatus.OK);
    }

}
