package com.aeropuerto.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aeropuerto.entitys.Pasajero;
import com.aeropuerto.models.dto.CheckinDTO;
import com.aeropuerto.models.dto.PasajeroDTO;
import com.aeropuerto.models.dto.PasajerosByReservaDTO;
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

    @Override
    public List<PasajerosByReservaDTO> findPasajerosByIdReserva(String idReserva) {
	List<Pasajero> lPasajeros = iPasajeroDao.findPasajerosByIdReserva(idReserva);
	List<PasajerosByReservaDTO> lPasajerosDto = new ArrayList<PasajerosByReservaDTO>();

	ModelMapper modelMapper = new ModelMapper();
	for (Pasajero pasajero : lPasajeros) {
	    PasajerosByReservaDTO pasajerosByReservaDto = modelMapper.map(pasajero, PasajerosByReservaDTO.class);
	    lPasajerosDto.add(pasajerosByReservaDto);
	}
	
//	ModelMapper mapper = new ModelMapper();
//	TypeToken<List<CheckinDTO>> typeToken = new TypeToken<List<CheckinDTO>>() {
//	};
//
//	List<CheckinDTO> lCheckinDto = mapper.map(lCheckins, typeToken.getType());


	return lPasajerosDto;
    }

}
