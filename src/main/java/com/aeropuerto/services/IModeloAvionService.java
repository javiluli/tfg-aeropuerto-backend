package com.aeropuerto.services;

import java.util.List;

import com.aeropuerto.entitys.ModeloAvion;

public interface IModeloAvionService {
    public ModeloAvion findModelosAvionByNombreModelo(String nombreModelo);

    public List<ModeloAvion> findAllModelosAvion();

}
