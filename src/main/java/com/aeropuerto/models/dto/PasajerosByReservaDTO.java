package com.aeropuerto.models.dto;

import java.io.Serializable;

public class PasajerosByReservaDTO implements Serializable {

    private static final long serialVersionUID = -668542228214382153L;

    private String idReserva;
    private String nombre;
    private String apellidos;
    private String dni;
    private String email;

    public PasajerosByReservaDTO() {
    }

    public PasajerosByReservaDTO(String idReserva, String nombre, String apellidos, String dni, String email) {
	this.idReserva = idReserva;
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.dni = dni;
	this.email = email;
    }

    public String getIdReserva() {
	return idReserva;
    }

    public void setIdReserva(String idReserva) {
	this.idReserva = idReserva;
    }

    public String getNombre() {
	return nombre;
    }

    public void setNombre(String nombre) {
	this.nombre = nombre;
    }

    public String getApellidos() {
	return apellidos;
    }

    public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
    }

    public String getDni() {
	return dni;
    }

    public void setDni(String dni) {
	this.dni = dni;
    }

    public String getEmail() {
	return email;
    }

    public void setEmail(String email) {
	this.email = email;
    }

}
