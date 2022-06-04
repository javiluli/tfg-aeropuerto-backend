package com.aeropuerto.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aeropuerto.entitys.ModeloAvion;
import com.aeropuerto.respositories.IModeloAvionDao;
import com.aeropuerto.services.IModeloAvionService;

@Service
public class ModeloAvionServiceImpl implements IModeloAvionService {

    @Autowired
    private IModeloAvionDao iModeloAvionDao;

    @Override
    public ModeloAvion findModelosAvionByNombreModelo(String nombreModelo) {
	return iModeloAvionDao.findModelosAvionByNombreModelo(nombreModelo);
    }

    @Override
    public List<ModeloAvion> findAllModelosAvion() {
	return iModeloAvionDao.findAll();
    }

}
