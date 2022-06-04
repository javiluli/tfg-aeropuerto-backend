package com.aeropuerto.services;

import java.util.List;

import com.aeropuerto.entitys.Escala;

public interface IEscalaService {
    public List<Escala> findAllEscalas();

    public Escala findEscalasByIdPrograma(String idPrograma);
}
