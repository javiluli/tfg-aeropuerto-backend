package com.aeropuerto.services;

import java.util.List;

import com.aeropuerto.entitys.Valoracion;

public interface IValoracionService {

    public List<Valoracion> findAllValoraciones();

    public Valoracion save(Valoracion valoracion);

}
