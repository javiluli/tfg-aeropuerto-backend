package com.aeropuerto.models.dto;

import java.io.Serializable;

public class CheckinDTO implements Serializable {

    private static final long serialVersionUID = 8247865017439411947L;

    private String idVuelo;
    private String nombreModelo;
    private String numeroFila;
    private String letraAsiento;

    public CheckinDTO() {
    }

    public CheckinDTO(String idVuelo, String nombreModelo, String numeroFila, String letraAsiento) {
	this.idVuelo = idVuelo;
	this.nombreModelo = nombreModelo;
	this.numeroFila = numeroFila;
	this.letraAsiento = letraAsiento;
    }

    public String getIdVuelo() {
	return idVuelo;
    }

    public void setIdVuelo(String idVuelo) {
	this.idVuelo = idVuelo;
    }

    public String getNombreModelo() {
	return nombreModelo;
    }

    public void setNombreModelo(String nombreModelo) {
	this.nombreModelo = nombreModelo;
    }

    public String getNumeroFila() {
	return numeroFila;
    }

    public void setNumeroFila(String numeroFila) {
	this.numeroFila = numeroFila;
    }

    public String getLetraAsiento() {
	return letraAsiento;
    }

    public void setLetraAsiento(String letraAsiento) {
	this.letraAsiento = letraAsiento;
    }

    @Override
    public String toString() {
	return "CheckinDTO [idVuelo=" + idVuelo + ", nombreModelo=" + nombreModelo + ", numeroFila=" + numeroFila
		+ ", letraAsiento=" + letraAsiento + "]";
    }

}
