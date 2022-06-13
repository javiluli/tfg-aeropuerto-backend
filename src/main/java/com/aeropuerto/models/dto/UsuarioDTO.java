package com.aeropuerto.models.dto;

import java.io.Serializable;
import java.util.List;

public class UsuarioDTO implements Serializable {

    private static final long serialVersionUID = 8247865017439411947L;

    private String nombre;
    private String password;
    private List<String> roles;

    public UsuarioDTO() {
    }

    public UsuarioDTO(String nombre, String password) {
	this.nombre = nombre;
	this.password = password;
    }

    public UsuarioDTO(String nombre, String password, List<String> roles) {
	this.nombre = nombre;
	this.password = password;
	this.roles = roles;
    }

    public String getNombre() {
	return nombre;
    }

    public void setNombre(String nombre) {
	this.nombre = nombre;
    }

    public String getPassword() {
	return password;
    }

    public void setPassword(String password) {
	this.password = password;
    }

    public List<String> getRoles() {
	return roles;
    }

    public void setRoles(List<String> roles) {
	this.roles = roles;
    }

}
