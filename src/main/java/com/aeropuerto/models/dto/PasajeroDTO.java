package com.aeropuerto.models.dto;

import java.io.Serializable;

public class PasajeroDTO implements Serializable {

    private static final long serialVersionUID = 384188242041202766L;

    private String idReserva;
    private String nombre;
    private String apellidos;
    private String dni;
    private String email;

    public PasajeroDTO() {
    }

    public PasajeroDTO(String idReserva, String nombre, String apellidos, String dni, String email) {
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

    @Override
    public String toString() {
	return "PasajeroDTO [idReserva=" + idReserva + ", nombre=" + nombre + ", apellidos=" + apellidos + ", dni="
		+ dni + ", email=" + email + "]";
    }

}
