package com.aeropuerto.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aeropuerto.entitys.Reserva;
import com.aeropuerto.models.dto.ReservaDTO;
import com.aeropuerto.respositories.IReservaDao;
import com.aeropuerto.services.IReservaService;

@Service
public class ReservaServiceImpl implements IReservaService {

    @Autowired
    private IReservaDao iReservaDao;

    @Override
    public void saveReservaDto(ReservaDTO reservaDto) {
	ModelMapper modelMapper = new ModelMapper();
	Reserva reserva = modelMapper.map(reservaDto, Reserva.class);
	iReservaDao.saveReservaDto(reserva.getIdReserva(), reserva.getFechaReserva(), reserva.getVuelo().getIdVuelo());
    }

}
