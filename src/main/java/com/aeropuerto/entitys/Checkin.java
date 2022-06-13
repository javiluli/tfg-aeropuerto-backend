package com.aeropuerto.entitys;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.aeropuerto.entitys.primaryKeys.IdCheckin;

@Entity
@Table(name = "checkin")
@IdClass(IdCheckin.class)
public class Checkin implements Serializable {

    private static final long serialVersionUID = -6272254565415149252L;

    @Id
    @JoinColumn(name = "id_vuelo", referencedColumnName = "id_vuelo", foreignKey = @ForeignKey(name = "fk_checkin_vuelo"), nullable = false)
    @ManyToOne(cascade = CascadeType.ALL)
    private Vuelo vuelo;

    @Id
    @JoinColumns({
	    @JoinColumn(name = "nombre_modelo", referencedColumnName = "nombre_modelo", foreignKey = @ForeignKey(name = "fk_checkin_asiento_1"), nullable = false),
	    @JoinColumn(name = "numero_fila", referencedColumnName = "numero_fila", foreignKey = @ForeignKey(name = "fk_checkin_asiento_2"), nullable = false),
	    @JoinColumn(name = "letra_asiento", referencedColumnName = "letra_asiento", foreignKey = @ForeignKey(name = "fk_checkin_asiento_3"), nullable = false) })
    @ManyToOne(cascade = CascadeType.ALL)
    private Asiento asiento;

    @JoinColumn(name = "id_reserva", referencedColumnName = "id_reserva", foreignKey = @ForeignKey(name = "fk_checkin_reserva"), nullable = false)
    @ManyToOne(cascade = CascadeType.ALL)
    private Reserva reserva;

    public Vuelo getVuelo() {
	return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
	this.vuelo = vuelo;
    }

    public Asiento getAsiento() {
	return asiento;
    }

    public void setAsiento(Asiento asiento) {
	this.asiento = asiento;
    }

    public Reserva getReserva() {
	return reserva;
    }

    public void setReserva(Reserva reserva) {
	this.reserva = reserva;
    }

}
