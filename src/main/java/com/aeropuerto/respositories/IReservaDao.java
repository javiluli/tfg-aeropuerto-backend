package com.aeropuerto.respositories;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.aeropuerto.entitys.Reserva;

@Repository
public interface IReservaDao extends JpaRepository<Reserva, String> {

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO reservas VALUES ( :idReserva, :fechaReserva, :idVuelo )", nativeQuery = true)
    public void saveReservaDto(String idReserva, Date fechaReserva, String idVuelo);

    
  
    @Query(value = "SELECT v.*, p.*, r.*"
    	+ "	    FROM reservas r, vuelos v, pasajeros p"
    	+ "	    WHERE r.id_vuelo = v.id_vuelo AND r.id_reserva = :idReserva AND p.id_reserva = :idReserva", nativeQuery = true)
    public Reserva findByReserva(String idReserva);
    
    @Modifying
    @Transactional
    @Query(value = "DELETE FROM reservas WHERE id_reserva = :idReserva", nativeQuery = true)
    public void eliminarReservaByIdReserva(String idReserva);
}
