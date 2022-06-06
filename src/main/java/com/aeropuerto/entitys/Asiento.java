package com.aeropuerto.entitys;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.aeropuerto.entitys.primaryKeys.IdAsiento;

@Entity
@Table(name = "asientos")
@IdClass(IdAsiento.class)
public class Asiento implements Serializable {

    private static final long serialVersionUID = 7976253059787621011L;

    @Id
    @JoinColumns({
	    @JoinColumn(name = "nombre_modelo", referencedColumnName = "nombre_modelo", foreignKey = @ForeignKey(name = "fk_asientos_prueba1"), nullable = false),
	    @JoinColumn(name = "numero_fila", referencedColumnName = "numero_fila", foreignKey = @ForeignKey(name = "fk_asientos_prueba2"), nullable = false) })
    @ManyToOne(cascade = CascadeType.ALL)
    private Fila fila;

    @Id
    @Column(length = 10, name = "letra_asiento", nullable = false)
    private String letraAsiento;

    public Fila getFila() {
	return fila;
    }

    public void setFila(Fila fila) {
	this.fila = fila;
    }

    public String getLetraAsiento() {
	return letraAsiento;
    }

    public void setLetraAsiento(String letraAsiento) {
	this.letraAsiento = letraAsiento;
    }

}
