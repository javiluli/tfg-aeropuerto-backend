package com.aeropuerto.entitys;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.aeropuerto.entitys.primaryKeys.IdPasajero;

@Entity
@Table(name = "pasajeros")
@IdClass(IdPasajero.class)
public class Pasajero implements Serializable {

    private static final long serialVersionUID = 483291801483080427L;

    @Id
    @JoinColumn(name = "id_reserva", referencedColumnName = "id_reserva", foreignKey = @ForeignKey(name = "fk_pasajeros_reservas"), nullable = false)
    @ManyToOne(cascade = CascadeType.ALL)
    private Reserva reserva;

    @Id
    @Column(length = 9, name = "dni")
    private String dni;

    @Column(length = 50, name = "nombre", nullable = false)
    private String nombre;

    @Column(length = 50, name = "apellidos", nullable = false)
    private String apellidos;

    @Column(length = 50, name = "email", nullable = false)
    private String email;

    public Reserva getReserva() {
	return reserva;
    }

    public void setReserva(Reserva reserva) {
	this.reserva = reserva;
    }

    public String getDni() {
	return dni;
    }

    public void setDni(String dni) {
	this.dni = dni;
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

    public String getEmail() {
	return email;
    }

    public void setEmail(String email) {
	this.email = email;
    }

    @Override
    public String toString() {
	return "Pasajero [reserva=" + reserva + ", dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos
		+ ", email=" + email + "]";
    }

}
