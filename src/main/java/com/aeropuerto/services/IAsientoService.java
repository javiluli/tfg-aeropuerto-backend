package com.aeropuerto.services;

import java.util.List;

import com.aeropuerto.models.dto.AsientoDTO;

public interface IAsientoService {

    public List<AsientoDTO> findAsientosByNombreModelo(String nombreModelo);

    public List<String> findLetraAsientoByNombreModeloAndNumeroFila(String nombreModelo, String numeroFila);

}
