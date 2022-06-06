package com.aeropuerto.services;

import com.aeropuerto.entitys.Fila;

public interface IFilaService {

    public Fila obtenerMaxNumeroFilaYCantidadAsientosByNombreModelo(String nombreModelo);

}
