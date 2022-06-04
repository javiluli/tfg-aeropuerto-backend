package com.aeropuerto.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.aeropuerto.entitys.Escala;
import com.aeropuerto.entitys.primaryKeys.IdEscala;

@Repository
public interface IEscalaDao extends JpaRepository<Escala, IdEscala> {

    @Query(value = "SELECT e.id_programa, e.aeropuerto, e.numero_escala FROM escalas e WHERE e.id_programa = :idPrograma GROUP BY e.id_programa", nativeQuery = true)
    public Escala cantidadEscalasByIdPrograma(String idPrograma);
}
