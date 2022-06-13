package com.aeropuerto.models.dto;

import java.io.Serializable;

public class AsientoDTO implements Serializable {

    private static final long serialVersionUID = -9001149676917103740L;

    private String numerofila;
    private String letraAsiento;
    private String nombreModelo;

    public AsientoDTO() {
    }

    public AsientoDTO(String numerofila, String letraAsiento, String nombreModelo) {
	this.numerofila = numerofila;
	this.letraAsiento = letraAsiento;
	this.nombreModelo = nombreModelo;
    }

    public String getNumerofila() {
	return numerofila;
    }

    public void setNumerofila(String numerofila) {
	this.numerofila = numerofila;
    }

    public String getLetraAsiento() {
	return letraAsiento;
    }

    public void setLetraAsiento(String letraAsiento) {
	this.letraAsiento = letraAsiento;
    }

    public String getNombreModelo() {
	return nombreModelo;
    }

    public void setNombreModelo(String nombreModelo) {
	this.nombreModelo = nombreModelo;
    }

    @Override
    public String toString() {
	return "AsientoDTO [numerofila=" + numerofila + ", letraAsiento=" + letraAsiento + ", nombreModelo="
		+ nombreModelo + "]";
    }

}
