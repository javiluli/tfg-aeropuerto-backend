package com.aeropuerto.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aeropuerto.entitys.Checkin;
import com.aeropuerto.models.dto.CheckinDTO;
import com.aeropuerto.respositories.ICheckinDao;
import com.aeropuerto.services.ICheckinService;

@Service
public class CheckinServiceImpl implements ICheckinService {

    @Autowired
    private ICheckinDao iCheckinDao;

    @Override
    public void saveCheckinDto(CheckinDTO checkinDto) {
//	ModelMapper modelMapper = new ModelMapper();
//	Checkin checkin = modelMapper.map(checkinDto, Checkin.class);
	iCheckinDao.saveCheckinDto(checkinDto.getIdVuelo(), checkinDto.getNombreModelo(), checkinDto.getNumeroFila(),
		checkinDto.getLetraAsiento(), checkinDto.getIdReserva());
    }

    @Override
    public List<Checkin> findCheckinsByIdVueloAndNombreModelo(String idVuelo, String nombreModelo) {
	return iCheckinDao.findCheckinsByIdVueloAndNombreModelo(idVuelo, nombreModelo);
    }

    @Override
    public List<CheckinDTO> findCheckinsByIdReserva(String idReserva) {
	List<Checkin> lCheckins = iCheckinDao.findCheckinsByIdReserva(idReserva);
	List<CheckinDTO> lCheckinDto = new ArrayList<CheckinDTO>();
	CheckinDTO checkinDto = new CheckinDTO();

	for (Checkin checkin : lCheckins) {
	    checkinDto.setIdVuelo(checkin.getVuelo().getIdVuelo());
	    checkinDto.setNombreModelo(checkin.getVuelo().getAvion().getModeloAvion().getNombreModelo());
	    checkinDto.setNumeroFila(checkin.getAsiento().getFila().getNumeroFila());
	    checkinDto.setLetraAsiento(checkin.getAsiento().getLetraAsiento());
	    checkinDto.setIdReserva(checkin.getReserva().getIdReserva());
	    lCheckinDto.add(checkinDto);
	}

	return lCheckinDto;
    }

}
