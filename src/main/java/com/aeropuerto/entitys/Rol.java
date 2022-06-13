package com.aeropuerto.entitys;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity(name = "Rol")
@Table(name = "roles", uniqueConstraints = { @UniqueConstraint(columnNames = { "descripcion" }, name = "uc_roles") })
public class Rol implements Serializable {
    /*
     * Niveles de roles
     * 
     * - 1000 usuario normal => "user" 
     * - 2000 usuario normal => "admin"
     * 
     */

    private static final long serialVersionUID = 8185071378711085206L;

    @Id
    @Column(length = 4, name = "id_rol")
    private String idRol;

    @Column(length = 16, name = "descripcion", nullable = false)
    private String descripcion;

    public String getIdRol() {
	return idRol;
    }

    public void setIdRol(String idRol) {
	this.idRol = idRol;
    }

    public String getDescripcion() {
	return descripcion;
    }

    public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
    }

}
