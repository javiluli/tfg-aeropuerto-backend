package com.aeropuerto.models.dto;

import java.io.Serializable;
import java.util.List;

public class FilaDTO implements Serializable {

    private static final long serialVersionUID = 3769340777348482161L;

    private String numeroFila;
    private List<String> butacas;

    public FilaDTO() {
    }

    public FilaDTO(String numeroFila, List<String> butacas) {
	this.numeroFila = numeroFila;
	this.butacas = butacas;
    }

    public String getNumeroFila() {
	return numeroFila;
    }

    public void setNumeroFila(String numeroFila) {
	this.numeroFila = numeroFila;
    }

    public List<String> getButacas() {
	return butacas;
    }

    public void setButacas(List<String> butacas) {
	this.butacas = butacas;
    }

    @Override
    public String toString() {
	return "FilaDTO [numeroFila=" + numeroFila + ", butacas=" + butacas + "]";
    }

}
