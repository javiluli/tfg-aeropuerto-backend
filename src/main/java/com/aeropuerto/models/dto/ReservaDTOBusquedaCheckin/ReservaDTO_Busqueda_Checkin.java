package com.aeropuerto.models.dto.ReservaDTOBusquedaCheckin;

import java.util.List;

import com.aeropuerto.models.dto.CheckinDTO;
import com.aeropuerto.models.dto.FilaDTO;
import com.aeropuerto.models.dto.PasajeroDTO;

public class ReservaDTO_Busqueda_Checkin {

    // ID de la reserva
    private String idReserva;

    // Obj vuelo simple
    private VueloDTO_Simple vuelo;

    // Lista de pasajeros asociados a la reserva
    private List<PasajeroDTO> pasajeros;

    // Lista de checkins realizados de la reserva
    private List<CheckinDTO> checkins;

    private String modeloAvion;

    // Lista de checkins realizados de la reserva
    private List<FilaDTO> filas;

    public ReservaDTO_Busqueda_Checkin() {
    }

    public ReservaDTO_Busqueda_Checkin(String idReserva, VueloDTO_Simple vuelo, List<PasajeroDTO> pasajeros, List<CheckinDTO> checkins, String modeloAvion, List<FilaDTO> filas) {
	this.idReserva = idReserva;
	this.vuelo = vuelo;
	this.pasajeros = pasajeros;
	this.checkins = checkins;
	this.modeloAvion = modeloAvion;
	this.filas = filas;
    }

    public String getIdReserva() {
	return idReserva;
    }

    public void setIdReserva(String idReserva) {
	this.idReserva = idReserva;
    }

    public VueloDTO_Simple getVuelo() {
	return vuelo;
    }

    public void setVuelo(VueloDTO_Simple vuelo) {
	this.vuelo = vuelo;
    }

    public List<PasajeroDTO> getPasajeros() {
	return pasajeros;
    }

    public void setPasajeros(List<PasajeroDTO> pasajeros) {
	this.pasajeros = pasajeros;
    }

    public List<CheckinDTO> getCheckins() {
	return checkins;
    }

    public void setCheckins(List<CheckinDTO> checkins) {
	this.checkins = checkins;
    }

    public String getModeloAvion() {
	return modeloAvion;
    }

    public void setModeloAvion(String modeloAvion) {
	this.modeloAvion = modeloAvion;
    }

    public List<FilaDTO> getFilas() {
	return filas;
    }

    public void setFilas(List<FilaDTO> filas) {
	this.filas = filas;
    }

}
