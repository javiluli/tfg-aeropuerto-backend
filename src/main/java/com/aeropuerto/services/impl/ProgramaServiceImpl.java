package com.aeropuerto.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aeropuerto.entitys.Programa;
import com.aeropuerto.respositories.IProgramaDao;
import com.aeropuerto.services.IProgramaService;

@Service
public class ProgramaServiceImpl implements IProgramaService {

    @Autowired
    private IProgramaDao iProgramaDao;

    @Override
    public List<Programa> findAll() {
	return iProgramaDao.findAll();
    }

}
