package com.aeropuerto.models.dto;

import java.io.Serializable;

import com.aeropuerto.entitys.Vuelo;

public class VueloDTO implements Serializable {

    private static final long serialVersionUID = 8984021260282002348L;

    private Vuelo vuelo;
    private String cantidadEscalas;
    private int plazasLibres;

    public VueloDTO() {
    }

    public VueloDTO(Vuelo vuelo, String cantidadEscalas, int plazasLibres) {
	this.vuelo = vuelo;
	this.cantidadEscalas = cantidadEscalas;
	this.plazasLibres = plazasLibres;
    }

    public Vuelo getVuelo() {
	return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
	this.vuelo = vuelo;
    }

    public String getCantidadEscalas() {
	return cantidadEscalas;
    }

    public void setCantidadEscalas(String cantidadEscalas) {
	this.cantidadEscalas = cantidadEscalas;
    }

    public int getPlazasLibres() {
	return plazasLibres;
    }

    public void setPlazasLibres(int plazasLibres) {
	this.plazasLibres = plazasLibres;
    }

}
