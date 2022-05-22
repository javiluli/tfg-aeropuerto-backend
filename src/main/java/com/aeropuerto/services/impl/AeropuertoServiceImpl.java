package com.aeropuerto.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aeropuerto.entitys.Aeropuerto;
import com.aeropuerto.respositories.IAeropuertoDao;
import com.aeropuerto.services.IAeropuertoService;

@Service
public class AeropuertoServiceImpl implements IAeropuertoService {

    @Autowired
    private IAeropuertoDao iAeropuertoDao;

    @Override
    public List<Aeropuerto> findAllAeropuertos() {
	return iAeropuertoDao.findAll();
    }

}
