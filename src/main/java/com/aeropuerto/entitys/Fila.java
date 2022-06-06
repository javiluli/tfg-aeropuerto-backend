package com.aeropuerto.entitys;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.aeropuerto.entitys.primaryKeys.IdFila;

@Entity
@Table(name = "filas")
@IdClass(IdFila.class)
public class Fila implements Serializable {

    private static final long serialVersionUID = -790512015080223603L;

    @Id
    @JoinColumn(name = "nombre_modelo", nullable = false)
    @ManyToOne(cascade = CascadeType.ALL)
    private ModeloAvion modeloAvion;

    @Id
    @Column(length = 10, name = "numero_fila", nullable = false)
    private String numeroFila;

    @Column(name = "cantidad_asientos", nullable = false)
    private int cantidadAsientos;

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

    public int getCantidadAsientos() {
	return cantidadAsientos;
    }

    public void setCantidadAsientos(int cantidadAsientos) {
	this.cantidadAsientos = cantidadAsientos;
    }

}
