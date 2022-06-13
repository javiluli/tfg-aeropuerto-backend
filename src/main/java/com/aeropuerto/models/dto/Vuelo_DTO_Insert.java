package com.aeropuerto.models.dto;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

public class Vuelo_DTO_Insert implements Serializable {

    private static final long serialVersionUID = 758943283818267423L;

    private String idVuelo;
    private String idPrograma;
    private Date fechaSalida;
    private Time horaSalida;
    private Date fechaLlegada;
    private Time horaLlegada;
    private int plazasOcupadas;
    private String matriculaAvion;

    public Vuelo_DTO_Insert() {
    }

    public Vuelo_DTO_Insert(String idVuelo, String idPrograma, Date fechaSalida, Time horaSalida, Date fechaLlegada,
	    Time horaLlegada, int plazasOcupadas, String matriculaAvion) {
	this.idVuelo = idVuelo;
	this.idPrograma = idPrograma;
	this.fechaSalida = fechaSalida;
	this.horaSalida = horaSalida;
	this.fechaLlegada = fechaLlegada;
	this.horaLlegada = horaLlegada;
	this.plazasOcupadas = plazasOcupadas;
	this.matriculaAvion = matriculaAvion;
    }

    public String getIdVuelo() {
	return idVuelo;
    }

    public void setIdVuelo(String idVuelo) {
	this.idVuelo = idVuelo;
    }

    public String getIdPrograma() {
	return idPrograma;
    }

    public void setIdPrograma(String idPrograma) {
	this.idPrograma = idPrograma;
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

    public int getPlazasOcupadas() {
	return plazasOcupadas;
    }

    public void setPlazasOcupadas(int plazasOcupadas) {
	this.plazasOcupadas = plazasOcupadas;
    }

    public String getMatriculaAvion() {
	return matriculaAvion;
    }

    public void setMatriculaAvion(String matriculaAvion) {
	this.matriculaAvion = matriculaAvion;
    }

}
