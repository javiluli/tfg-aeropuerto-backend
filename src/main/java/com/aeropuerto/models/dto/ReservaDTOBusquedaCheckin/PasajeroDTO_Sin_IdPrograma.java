package com.aeropuerto.models.dto.ReservaDTOBusquedaCheckin;

import java.io.Serializable;

public class PasajeroDTO_Sin_IdPrograma implements Serializable {

    private static final long serialVersionUID = 384188242041202766L;

    private String nombre;
    private String apellidos;
    private String dni;
    private String email;

    public PasajeroDTO_Sin_IdPrograma() {
    }

    public PasajeroDTO_Sin_IdPrograma(String nombre, String apellidos, String dni, String email) {
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.dni = dni;
	this.email = email;
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
