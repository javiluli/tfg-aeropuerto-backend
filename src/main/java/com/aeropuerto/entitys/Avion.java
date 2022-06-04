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

@Entity
@Table(name = "aviones")
public class Avion implements Serializable {

    private static final long serialVersionUID = 4152722704808700635L;

    @Id
    @Column(length = 6, name = "matricula_avion")
    private String matriculaAvion;

    @JoinColumn(name = "nombre_modelo", foreignKey = @ForeignKey(name = "fk_avion_modelosAvion"), nullable = false)
    @ManyToOne(cascade = CascadeType.ALL)
    private ModeloAvion modeloAvion;

    public String getMatriculaAvion() {
	return matriculaAvion;
    }

    public void setMatriculaAvion(String matriculaAvion) {
	this.matriculaAvion = matriculaAvion;
    }

    public ModeloAvion getModeloAvion() {
	return modeloAvion;
    }

    public void setModeloAvion(ModeloAvion modeloAvion) {
	this.modeloAvion = modeloAvion;
    }

}
