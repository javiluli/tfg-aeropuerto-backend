package com.aeropuerto.respositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.aeropuerto.entitys.Asiento;
import com.aeropuerto.entitys.primaryKeys.IdAsiento;

@Repository
public interface IAsientoDao extends JpaRepository<Asiento, IdAsiento> {

    @Query(value = "SELECT a.numero_fila, a.letra_asiento, a.nombre_modelo FROM asientos a WHERE a.nombre_modelo = :nombreModelo", nativeQuery = true)
    public List<Asiento> findAsientosByNombreModelo(String nombreModelo);

    @Query(value = "SELECT a.letra_asiento FROM asientos a WHERE a.nombre_modelo = :nombreModelo AND a.numero_fila = :numeroFila ", nativeQuery = true)
    public List<String> findLetraAsientoByNombreModeloAndNumeroFila(String nombreModelo, String numeroFila);

}
