package com.aeropuerto.models.dto.ReservaDTOBusquedaCheckin;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

public class VueloDTO_Simple implements Serializable {

    private static final long serialVersionUID = -219938011637814039L;

    private String idVuelo;
    private Date fechaSalida;
    private Time horaSalida;
    private Date fechaLlegada;
    private Time horaLlegada;
    private String matriculaAvion;

    public VueloDTO_Simple() {
    }

    public VueloDTO_Simple(String idVuelo, Date fechaSalida, Time horaSalida, Date fechaLlegada, Time horaLlegada,
	    String matriculaAvion) {
	this.idVuelo = idVuelo;
	this.fechaSalida = fechaSalida;
	this.horaSalida = horaSalida;
	this.fechaLlegada = fechaLlegada;
	this.horaLlegada = horaLlegada;
	this.matriculaAvion = matriculaAvion;
    }

    public String getIdVuelo() {
	return idVuelo;
    }

    public void setIdVuelo(String idVuelo) {
	this.idVuelo = idVuelo;
    }

    public Date getFechaSalida() {
	return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
	this.fechaSalida = fechaSalida;
    }

    public Time getHoraSalida() {
	return horaSalida;
    }

    public void setHoraSalida(Time horaSalida) {
	this.horaSalida = horaSalida;
    }

    public Date getFechaLlegada() {
	return fechaLlegada;
    }

    public void setFechaLlegada(Date fechaLlegada) {
	this.fechaLlegada = fechaLlegada;
    }

    public Time getHoraLlegada() {
	return horaLlegada;
    }

    public void setHoraLlegada(Time horaLlegada) {
	this.horaLlegada = horaLlegada;
    }

    public String getMatriculaAvion() {
	return matriculaAvion;
    }

    public void setMatriculaAvion(String matriculaAvion) {
	this.matriculaAvion = matriculaAvion;
    }

}
