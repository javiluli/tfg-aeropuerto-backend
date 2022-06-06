package com.aeropuerto.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.aeropuerto.entitys.Fila;
import com.aeropuerto.entitys.primaryKeys.IdFila;

@Repository
public interface IFilaDao extends JpaRepository<Fila, IdFila> {

    @Query(value = "SELECT MAX(f.numero_fila) 'numero_fila', f.cantidad_asientos, f.nombre_modelo FROM filas f where nombre_modelo = :nombreModelo", nativeQuery = true)
    public Fila obtenerMaxNumeroFilaYCantidadAsientosByNombreModelo(String nombreModelo);

}
