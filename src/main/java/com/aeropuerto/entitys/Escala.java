package com.aeropuerto.entitys;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.aeropuerto.entitys.primaryKeys.IdEscala;

@Entity
@Table(name = "escalas")
@IdClass(IdEscala.class)
public class Escala {

    @Id
    @JoinColumn(name = "aeropuerto", referencedColumnName = "id_aeropuerto", foreignKey = @ForeignKey(name = "fk_escalas_aeropuertos"), nullable = false)
    @ManyToOne(cascade = CascadeType.ALL)
    private Aeropuerto aeropuerto;

    @Id
    @JoinColumn(name = "id_programa", referencedColumnName = "id_programa", foreignKey = @ForeignKey(name = "fk_escalas_programas"), nullable = false)
    @ManyToOne(cascade = CascadeType.ALL)
    private Programa programa;

    @Column(length = 2, name = "numero_escala", nullable = false)
    String numeroEscala;

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

    public String getNumeroEscala() {
	return numeroEscala;
    }

    public void setNumeroEscala(String numeroEscala) {
	this.numeroEscala = numeroEscala;
    }

}
