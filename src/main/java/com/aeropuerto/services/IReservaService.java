package com.aeropuerto.services;

import com.aeropuerto.entitys.Reserva;
import com.aeropuerto.models.dto.ReservaDTO;
import com.aeropuerto.models.dto.ReservaDTOBusquedaCheckin.ReservaDTO_Busqueda_Checkin;

public interface IReservaService {

    Reserva findPasajeroByIdReserva(String idReserva);

    public void saveReservaDto(ReservaDTO reserva);
    
    public void eliminarReservaByIdReserva(String idReserva);
    
    public ReservaDTO_Busqueda_Checkin findReservaByIdReserva(String idReserva);

}
