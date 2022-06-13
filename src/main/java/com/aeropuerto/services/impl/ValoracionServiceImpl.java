package com.aeropuerto.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aeropuerto.entitys.Valoracion;
import com.aeropuerto.respositories.IValoracionDao;
import com.aeropuerto.services.IValoracionService;

@Service
public class ValoracionServiceImpl implements IValoracionService {

    @Autowired
    private IValoracionDao iValoracionDao;

    @Override
    public List<Valoracion> findAllValoraciones() {
	return iValoracionDao.findAll();
    }

    @Override
    public Valoracion save(Valoracion valoracion) {
	return iValoracionDao.save(valoracion);
    }

}
