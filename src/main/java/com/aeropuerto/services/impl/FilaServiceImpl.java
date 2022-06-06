package com.aeropuerto.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aeropuerto.entitys.Fila;
import com.aeropuerto.respositories.IFilaDao;
import com.aeropuerto.services.IFilaService;

@Service
public class FilaServiceImpl implements IFilaService {

    @Autowired
    private IFilaDao iFilaDao;

    @Override
    public Fila obtenerMaxNumeroFilaYCantidadAsientosByNombreModelo(String nombreModelo) {
	return iFilaDao.obtenerMaxNumeroFilaYCantidadAsientosByNombreModelo(nombreModelo);
    }

}
