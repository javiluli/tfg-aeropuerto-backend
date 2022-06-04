package com.aeropuerto.entitys;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "programas")
public class Programa implements Serializable {

    private static final long serialVersionUID = 1954599545314503540L;

    @Id
    @Column(length = 15, name = "id_programa")
    private String idPrograma;

    @JoinColumn(name = "id_aerolinea", referencedColumnName = "id_aerolinea", foreignKey = @ForeignKey(name = "fk_programa_aerolinea"), nullable = false)
    @ManyToOne(cascade = CascadeType.ALL)
    private Aerolinea aerolinea;

    @JoinColumn(name = "origen", referencedColumnName = "id_aeropuerto", foreignKey = @ForeignKey(name = "fk_programa_origen"), nullable = false)
    @ManyToOne(cascade = CascadeType.ALL)
    private Aeropuerto origen;

    @JoinColumn(name = "destino", referencedColumnName = "id_aeropuerto", foreignKey = @ForeignKey(name = "fk_programa_destino"), nullable = false)
    @ManyToOne(cascade = CascadeType.ALL)
    private Aeropuerto destino;

    public String getIdPrograma() {
	return idPrograma;
    }

    public void setIdPrograma(String idPrograma) {
	this.idPrograma = idPrograma;
    }

    public Aerolinea getAerolinea() {
	return aerolinea;
    }

    public void setAerolinea(Aerolinea aerolinea) {
	this.aerolinea = aerolinea;
    }

    public Aeropuerto getOrigen() {
	return origen;
    }

    public void setOrigen(Aeropuerto origen) {
	this.origen = origen;
    }

    public Aeropuerto getDestino() {
	return destino;
    }

    public void setDestino(Aeropuerto destino) {
	this.destino = destino;
    }

    @Override
    public String toString() {
	return "Programa [idPrograma=" + idPrograma + ", aerolinea=" + aerolinea + ", origen=" + origen + ", destino="
		+ destino + "]";
    }

}
