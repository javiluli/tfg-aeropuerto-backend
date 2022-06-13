package com.aeropuerto.models.dto;

import java.io.Serializable;
import java.util.Date;

public class ReservaDTO implements Serializable {

    private static final long serialVersionUID = -9001149676917103740L;

    private String idReserva;
    private String idVuelo;
    private Date fechaReserva;

    public ReservaDTO() {
    }

    public ReservaDTO(String idReserva, String idVuelo, Date fechaReserva) {
	this.idReserva = idReserva;
	this.idVuelo = idVuelo;
	this.fechaReserva = fechaReserva;
    }

    public String getIdReserva() {
	return idReserva;
    }

    public void setIdReserva(String idReserva) {
	this.idReserva = idReserva;
    }

    public String getIdVuelo() {
	return idVuelo;
    }

    public void setIdVuelo(String idVuelo) {
	this.idVuelo = idVuelo;
    }

    public Date getFechaReserva() {
	return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
	this.fechaReserva = fechaReserva;
    }

    @Override
    public String toString() {
	return "ReservaDTO [idReserva=" + idReserva + ", idVuelo=" + idVuelo + ", fechaReserva=" + fechaReserva + "]";
    }

}
