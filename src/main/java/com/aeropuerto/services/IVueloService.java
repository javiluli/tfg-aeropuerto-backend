package com.aeropuerto.services;

import java.util.List;

import com.aeropuerto.entitys.Vuelo;

public interface IVueloService {

    public List<Vuelo> findVuelosBy(String origen, String destino, String fechaSalida, String horaSalida);

    void updatePlazasOcupadasFromVuelo(String idVuelo, int plazasOcupadas);

    void updatePlazasOcupadasMenosFromVuelo(String idVuelo);

}
