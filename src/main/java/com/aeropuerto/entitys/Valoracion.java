package com.aeropuerto.entitys;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "valoraciones")
public class Valoracion implements Serializable {

    private static final long serialVersionUID = 3521690053876951394L;

    @Id
    @Column(length = 16, name = "user")
    private String user;

    @Column(length = 2, name = "valoracion", nullable = false)
    private double valoracion;

    public String getUser() {
	return user;
    }

    public void setUser(String user) {
	this.user = user;
    }

    public double getValoracion() {
	return valoracion;
    }

    public void setValoracion(double valoracion) {
	this.valoracion = valoracion;
    }

}
