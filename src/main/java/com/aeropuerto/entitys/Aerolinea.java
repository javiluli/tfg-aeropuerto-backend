package com.aeropuerto.entitys;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "aerolineas", uniqueConstraints = { @UniqueConstraint(columnNames = { "nombre" }, name = "uc_aerolineas") })
public class Aerolinea implements Serializable {

    private static final long serialVersionUID = -6309056927387377036L;

    @Id
    @Column(length = 2, name = "id_aerolinea")
    private String idAerolinea;

    @Column(length = 40, name = "nombre", nullable = false)
    private String nombre;

    public String getIdAerolinea() {
	return idAerolinea;
    }

    public void setIdAerolinea(String idAerolinea) {
	this.idAerolinea = idAerolinea;
    }

    public String getNombre() {
	return nombre;
    }

    public void setNombre(String nombre) {
	this.nombre = nombre;
    }

}
