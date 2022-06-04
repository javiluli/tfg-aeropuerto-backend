package com.aeropuerto.entitys.primaryKeys;

import java.io.Serializable;

import com.aeropuerto.entitys.Aeropuerto;
import com.aeropuerto.entitys.Programa;

public class IdEscala implements Serializable {

    private static final long serialVersionUID = 2141944917165653844L;

    private Aeropuerto aeropuerto;
    private Programa programa;

    public IdEscala() {
    }

    public IdEscala(Aeropuerto aeropuerto, Programa programa) {
	this.aeropuerto = aeropuerto;
	this.programa = programa;
    }

    public Aeropuerto getAeropuerto() {
	return aeropuerto;
    }

    public void setAeropuerto(Aeropuerto aeropuerto) {
	this.aeropuerto = aeropuerto;
    }

    public Programa getPrograma() {
	return programa;
    }

    public void setPrograma(Programa programa) {
	this.programa = programa;
    }

}
