package com.aeropuerto.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.aeropuerto.entitys.ModeloAvion;

@Repository
public interface IModeloAvionDao extends JpaRepository<ModeloAvion, String> {

    public ModeloAvion findModelosAvionByNombreModelo(String nombreModelo);

}
