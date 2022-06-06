package com.aeropuerto.entitys.primaryKeys;

import java.io.Serializable;

import com.aeropuerto.entitys.Asiento;
import com.aeropuerto.entitys.Vuelo;

public class IdCheckin implements Serializable {

    private static final long serialVersionUID = -5611473436231659253L;

    private Vuelo vuelo;
    private Asiento asiento;

    public IdCheckin() {
    }

    public IdCheckin(Vuelo vuelo, Asiento asiento) {
	this.vuelo = vuelo;
	this.asiento = asiento;
    }

    public Vuelo getVuelo() {
	return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
	this.vuelo = vuelo;
    }

    public Asiento getAsiento() {
	return asiento;
    }

    public void setAsiento(Asiento asiento) {
	this.asiento = asiento;
    }

}
