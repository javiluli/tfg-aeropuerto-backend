package com.aeropuerto.services;

import java.util.List;

import com.aeropuerto.entitys.Asiento;

public interface IAsientoService {
    public List<Asiento> findAllAsientos();
}
