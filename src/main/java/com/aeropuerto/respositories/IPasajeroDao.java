package com.aeropuerto.respositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.aeropuerto.entitys.Pasajero;
import com.aeropuerto.entitys.primaryKeys.IdPasajero;

@Repository
public interface IPasajeroDao extends JpaRepository<Pasajero, IdPasajero> {
    
    @Modifying
    @Transactional
    @Query(value = "INSERT INTO pasajeros VALUES ( :dni, :apellidos, :email, :nombre, :id_reserva )", nativeQuery = true)
    public void savePasajeroDto(String dni, String apellidos, String email, String nombre, String id_reserva);

    @Query(value = "SELECT p.* FROM pasajeros p WHERE p.id_reserva = :idReserva", nativeQuery = true)
    public List<Pasajero> findPasajerosByIdReserva(String idReserva);

}
