package com.aeropuerto.services;

import com.aeropuerto.entitys.Reserva;
import com.aeropuerto.models.dto.ReservaDTO;

public interface IReservaService {

    Reserva findPasajeroByIdReserva(String idReserva);

    public void saveReservaDto(ReservaDTO reserva);
    
    public void eliminarReservaByIdReserva(String idReserva);

}
