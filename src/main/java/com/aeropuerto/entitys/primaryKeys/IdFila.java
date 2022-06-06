package com.aeropuerto.entitys.primaryKeys;

import java.io.Serializable;

import com.aeropuerto.entitys.ModeloAvion;

public class IdFila implements Serializable {

    private static final long serialVersionUID = -9172312206224825883L;

    private ModeloAvion modeloAvion;
    private String numeroFila;

    public IdFila() {
    }

    public IdFila(ModeloAvion modeloAvion, String numeroFila) {
	this.modeloAvion = modeloAvion;
	this.numeroFila = numeroFila;
    }

    public ModeloAvion getModeloAvion() {
	return modeloAvion;
    }

    public void setModeloAvion(ModeloAvion modeloAvion) {
	this.modeloAvion = modeloAvion;
    }

    public String getNumeroFila() {
	return numeroFila;
    }

    public void setNumeroFila(String numeroFila) {
	this.numeroFila = numeroFila;
    }

}
