package com.aeropuerto.services;

import com.aeropuerto.entitys.Pasajero;
import com.aeropuerto.models.dto.PasajeroDTO;

public interface IPasajeroService {

    public Pasajero findPasajeroByIdReserva(String idReserva);

    public void savePasajeroDto(PasajeroDTO pasajero);

}
