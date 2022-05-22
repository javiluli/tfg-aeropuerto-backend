package com.aeropuerto.entitys;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "aeropuertos")
public class Aeropuerto implements Serializable {

    private static final long serialVersionUID = 3284973263216894869L;

    @Id
    @Column(length = 3, name = "id_aeropuerto")
    private String idAeropuerto;

    @Column(length = 30, name = "nombre", nullable = false)
    private String nombre;

    @Column(length = 30, name = "ciudad", nullable = false)
    private String ciudad;

    @Column(length = 30, name = "pais", nullable = false)
    private String pais;

    public String getIdAeropuerto() {
	return idAeropuerto;
    }

    public void setIdAeropuerto(String idAeropuerto) {
	this.idAeropuerto = idAeropuerto;
    }

    public String getNombre() {
	return nombre;
    }

    public void setNombre(String nombre) {
	this.nombre = nombre;
    }

    public String getCiudad() {
	return ciudad;
    }

    public void setCiudad(String ciudad) {
	this.ciudad = ciudad;
    }

    public String getPais() {
	return pais;
    }

    public void setPais(String pais) {
	this.pais = pais;
    }

}
