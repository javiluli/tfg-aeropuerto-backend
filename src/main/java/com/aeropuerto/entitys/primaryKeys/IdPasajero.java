package com.aeropuerto.entitys.primaryKeys;

import java.io.Serializable;

import com.aeropuerto.entitys.Reserva;

public class IdPasajero implements Serializable {

    private static final long serialVersionUID = 8688449007180797457L;

    private Reserva reserva;
    private String dni;

    public IdPasajero() {
    }

    public IdPasajero(Reserva reserva, String dni) {
	this.reserva = reserva;
	this.dni = dni;
    }

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

}
