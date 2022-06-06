package com.aeropuerto.entitys.primaryKeys;

import java.io.Serializable;

import com.aeropuerto.entitys.Fila;

public class IdAsiento implements Serializable {

    private static final long serialVersionUID = 7367790034793447909L;

    private Fila fila;
    private String letraAsiento;

    public IdAsiento() {
    }

    public IdAsiento(Fila fila, String letraAsiento) {
	this.fila = fila;
	this.letraAsiento = letraAsiento;
    }

    public Fila getFila() {
	return fila;
    }

    public void setFila(Fila fila) {
	this.fila = fila;
    }

    public String getLetraAsiento() {
	return letraAsiento;
    }

    public void setLetraAsiento(String letraAsiento) {
	this.letraAsiento = letraAsiento;
    }

}
