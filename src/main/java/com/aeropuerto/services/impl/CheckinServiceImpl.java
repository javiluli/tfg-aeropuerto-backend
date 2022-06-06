package com.aeropuerto.services.impl;

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
	iCheckinDao.saveCheckinDto(checkinDto.getIdVuelo(), checkinDto.getNombreModelo(), checkinDto.getNumeroFila(), checkinDto.getLetraAsiento());
    }

    @Override
    public List<Checkin> findCheckinsByIdVueloAndNombreModelo(String idVuelo, String nombreModelo) {
	return iCheckinDao.findCheckinsByIdVueloAndNombreModelo(idVuelo, nombreModelo);
    }

}
