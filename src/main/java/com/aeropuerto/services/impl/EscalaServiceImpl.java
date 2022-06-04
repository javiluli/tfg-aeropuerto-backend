package com.aeropuerto.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aeropuerto.entitys.Escala;
import com.aeropuerto.respositories.IEscalaDao;
import com.aeropuerto.services.IEscalaService;

@Service
public class EscalaServiceImpl implements IEscalaService {

    @Autowired
    private IEscalaDao iEscalaDao;

    @Override
    public List<Escala> findAllEscalas() {
	return iEscalaDao.findAll();
    }
    
    @Override
    public Escala findEscalasByIdPrograma(String idPrograma) {
	return iEscalaDao.cantidadEscalasByIdPrograma(idPrograma);
    }

}
