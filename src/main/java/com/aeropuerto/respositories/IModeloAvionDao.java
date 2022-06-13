package com.aeropuerto.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.aeropuerto.entitys.ModeloAvion;

@Repository
public interface IModeloAvionDao extends JpaRepository<ModeloAvion, String> {

    public ModeloAvion findModelosAvionByNombreModelo(String nombreModelo);

    @Query(value = "SELECT a.nombre_modelo"
    	+ "   	    FROM vuelos v, aviones a, reservas r "
    	+ "	    WHERE r.id_reserva = :idReserva AND r.id_vuelo = v.id_vuelo AND v.matricula_avion = a.matricula_avion", nativeQuery = true)
    public String findModelosAvionByIdReserva(String idReserva);

}
