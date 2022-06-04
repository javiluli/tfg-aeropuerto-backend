package com.aeropuerto.entitys;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "vuelos", uniqueConstraints = {
	@UniqueConstraint(columnNames = { "id_programa", "fecha_salida", "hora_salida" }, name = "uc_vuelos") })
//@Check(constraints = "fecha_salida <= fecha_llegada")
public class Vuelo implements Serializable {

    private static final long serialVersionUID = -2612459301869323942L;

    @Id
    @Column(name = "id_vuelo", updatable = false, nullable = false)
    private String idVuelo;

    @JoinColumn(name = "id_programa", referencedColumnName = "id_programa", foreignKey = @ForeignKey(name = "fk_vuelos_programas"), nullable = false)
    @ManyToOne(cascade = CascadeType.ALL)
    private Programa programa;

    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+2")
    @Column(name = "fecha_salida")
    private Date fechaSalida;

    @Column(name = "hora_salida", nullable = false)
    private Time horaSalida;

    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+2")
    @Column(name = "fecha_llegada", nullable = false)
    private Date fechaLlegada;

    @Column(name = "hora_llegada", nullable = false)
    private Time horaLlegada;

    @Column(length = 3, name = "plazas_ocupadas", nullable = false)
    private int plazasOcupadas;

    @JoinColumn(name = "matricula_avion", referencedColumnName = "matricula_avion", foreignKey = @ForeignKey(name = "fk_vuelos_aviones"), nullable = false)
    @ManyToOne(cascade = CascadeType.ALL)
    private Avion avion;

    public String getIdVuelo() {
	return idVuelo;
    }

    public void setIdVuelo(String idVuelo) {
	this.idVuelo = idVuelo;
    }

    public Programa getPrograma() {
	return programa;
    }

    public void setPrograma(Programa programa) {
	this.programa = programa;
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

    public Avion getAvion() {
	return avion;
    }

    public void setAvion(Avion avion) {
	this.avion = avion;
    }

    @Override
    public String toString() {
	return "Vuelo [idVuelo=" + idVuelo + ", programa=" + programa + ", fechaSalida=" + fechaSalida + ", horaSalida="
		+ horaSalida + ", fechaLlegada=" + fechaLlegada + ", horaLlegada=" + horaLlegada + ", plazasOcupadas="
		+ plazasOcupadas + ", avion=" + avion + "]";
    }
    
    

}
