package com.aeropuerto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aeropuerto.entitys.Checkin;
import com.aeropuerto.entitys.Reserva;
import com.aeropuerto.models.dto.CheckinDTO;
import com.aeropuerto.services.ICheckinService;

@RestController
@CrossOrigin("*")
public class CheckinController {

    @Autowired
    private ICheckinService iCheckinService;

    @PostMapping("/checkin")
    public ResponseEntity<String> guardarCheckin(@RequestBody CheckinDTO checkinDto) {
	System.out.println(checkinDto);
	iCheckinService.saveCheckinDto(checkinDto);
	return new ResponseEntity<String>(HttpStatus.OK);
    }
    
    @GetMapping("/checkins/{modelo}/{id}")
    public ResponseEntity<List<Checkin>> findCheckinsByIdVueloAndNombreModelo(@PathVariable(name = "modelo") String nombreModelo, @PathVariable(name = "id") String idVuelo) {
	return new ResponseEntity<List<Checkin>>(iCheckinService.findCheckinsByIdVueloAndNombreModelo(idVuelo, nombreModelo), HttpStatus.OK);
    }
}
