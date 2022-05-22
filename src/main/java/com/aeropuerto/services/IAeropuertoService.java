package com.aeropuerto.services;

import java.util.List;

import com.aeropuerto.entitys.Aeropuerto;

public interface IAeropuertoService {
    public List<Aeropuerto> findAllAeropuertos();
}
