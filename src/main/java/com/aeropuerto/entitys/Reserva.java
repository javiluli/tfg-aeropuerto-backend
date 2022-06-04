package com.aeropuerto.entitys;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

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

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "reservas")
public class Reserva implements Serializable {

    private static final long serialVersionUID = 4763076783051849398L;

    @Id
    @Column(name = "id_reserva", nullable = false)
    private String idReserva;

    @JoinColumn(name = "id_vuelo", referencedColumnName = "id_vuelo", foreignKey = @ForeignKey(name = "fk_reservas_vuelos"), nullable = false)
    @ManyToOne(cascade = CascadeType.ALL)
    private Vuelo vuelo;

    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+2")
    @Column(name = "fecha_reserva", nullable = false)
    private Date fechaReserva;

    public String getIdReserva() {
	return idReserva;
    }

    public void setIdReserva(String idReserva) {
	this.idReserva = idReserva;
    }

    public Vuelo getVuelo() {
	return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
	this.vuelo = vuelo;
    }

    public Date getFechaReserva() {
	return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
	this.fechaReserva = fechaReserva;
    }

    @Override
    public String toString() {
	return "Reserva [idReserva=" + idReserva + ", vuelo=" + vuelo + ", fechaReserva=" + fechaReserva + "]";
    }

}
