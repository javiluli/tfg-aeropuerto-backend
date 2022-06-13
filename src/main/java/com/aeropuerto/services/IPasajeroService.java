package com.aeropuerto.services;

import java.util.List;

import com.aeropuerto.models.dto.PasajeroDTO;
import com.aeropuerto.models.dto.PasajerosByReservaDTO;

public interface IPasajeroService {

    public List<PasajerosByReservaDTO> findPasajerosByIdReserva(String idReserva);

    public void savePasajeroDto(PasajeroDTO pasajero);

}
