package com.aeropuerto.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aeropuerto.entitys.Asiento;
import com.aeropuerto.respositories.IAsientoDao;
import com.aeropuerto.services.IAsientoService;

@Service
public class AsientoServiceImpl implements IAsientoService {

    @Autowired
    private IAsientoDao iAsientoDao;

    @Override
    public List<Asiento> findAllAsientos() {
	return iAsientoDao.findAll();
    }

}
