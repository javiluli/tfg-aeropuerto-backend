package com.aeropuerto.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aeropuerto.entitys.Pasajero;
import com.aeropuerto.models.dto.PasajeroDTO;
import com.aeropuerto.respositories.IPasajeroDao;
import com.aeropuerto.services.IPasajeroService;

@Service
public class PasajeroServiceImpl implements IPasajeroService {

    @Autowired
    private IPasajeroDao iPasajeroDao;

    @Override
    public void savePasajeroDto(PasajeroDTO pasajeroDto) {
	ModelMapper modelMapper = new ModelMapper();
	Pasajero pasajero = modelMapper.map(pasajeroDto, Pasajero.class);
	iPasajeroDao.savePasajeroDto(pasajero.getDni(), pasajero.getApellidos(), pasajero.getEmail(), pasajero.getNombre(), pasajero.getReserva().getIdReserva());
    }

}
