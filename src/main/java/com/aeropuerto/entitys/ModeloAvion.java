package com.aeropuerto.entitys;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "modelos_avion")
public class ModeloAvion implements Serializable {

    private static final long serialVersionUID = -6241749325367758199L;

    @Id
    @Column(length = 30, name = "nombre_modelo")
    String nombreModelo;

    @Column(name = "capacidad", nullable = false)
    int capacidad;

    public String getNombreModelo() {
	return nombreModelo;
    }

    public void setNombreModelo(String nombreModelo) {
	this.nombreModelo = nombreModelo;
    }

    public int getCapacidad() {
	return capacidad;
    }

    public void setCapacidad(int capacidad) {
	this.capacidad = capacidad;
    }

}
