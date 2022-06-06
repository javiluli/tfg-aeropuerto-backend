package com.aeropuerto.services;

import java.util.List;

import com.aeropuerto.entitys.Checkin;
import com.aeropuerto.models.dto.CheckinDTO;

public interface ICheckinService {

    public void saveCheckinDto(CheckinDTO checkinDto);

    public List<Checkin> findCheckinsByIdVueloAndNombreModelo(String idVuelo, String nombreModelo);
}
