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

import com.aeropuerto.util.Const;

@Entity(name = "Usuario")
@Table(name = "usuarios")
public class Usuario implements Serializable {

    private static final long serialVersionUID = -8073453390491387835L;

    @Id
    @Column(length = 16, name = "id_usuario", nullable = false)
    private String idUsuario;

    @Column(length = 16, name = "nombre", nullable = false)
    private String nombre;

    @Column(length = 32, name = "password", nullable = false)
    private String password;

    @JoinColumn(name = "id_rol", foreignKey = @ForeignKey(name = Const.FK_USUARIOS_ROLES), nullable = false)
    @ManyToOne(cascade = CascadeType.ALL)
    private Rol rol;

    public String getIdUsuario() {
	return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
	this.idUsuario = idUsuario;
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

    public Rol getRol() {
	return rol;
    }

    public void setRol(Rol rol) {
	this.rol = rol;
    }

    @Override
    public String toString() {
	return "Usuario [idUsuario=" + idUsuario + ", nombre=" + nombre + ", password=" + password + ", rol=" + rol
		+ "]";
    }

}
