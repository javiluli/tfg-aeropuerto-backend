package com.aeropuerto.respositories;

import java.sql.Time;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.aeropuerto.entitys.Vuelo;
import com.aeropuerto.models.dto.ReservaDTOBusquedaCheckin.VueloDTO_Simple;

@Repository
public interface IVueloDao extends JpaRepository<Vuelo, String> {

    @Query(value = "SELECT v.id_vuelo, v.fecha_salida, v.hora_salida, v.fecha_llegada, v.hora_llegada, v.plazas_ocupadas, v.matricula_avion, v.id_programa"
	    + " FROM vuelos v" + " WHERE v.id_programa IN ( SELECT p.id_programa"
	    + " 			     	     FROM programas p"
	    + "			    	     WHERE p.origen = :origen AND p.destino = :destino )"
	    + "       AND (v.fecha_salida = :fechaSalida AND v.hora_salida > :horaSalida)"
	    + "ORDER BY v.fecha_salida, v.hora_salida", nativeQuery = true)
    public List<Vuelo> findVuelosBy(String origen, String destino, String fechaSalida, String horaSalida);

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO vuelos VALUES (:idVuelo, :fechaLlegada, :fechaSalida, :horaSalida, :horaLlegada, :plazasOcupadas, :matriculaAvion, :idPrograma)", nativeQuery = true)
    public Vuelo addNewVuelo(String idVuelo, String idPrograma, Date fechaSalida, Time horaSalida, Date fechaLlegada, Time horaLlegada, int plazasOcupadas, String matriculaAvion);

    @Modifying
    @Transactional
    @Query(value = "UPDATE vuelos" 
    + "	    	    SET plazas_ocupadas = plazas_ocupadas + :numero_pasajeros"
    + "	    	    WHERE id_vuelo = :id_vuelo", nativeQuery = true)
    public void updatePlazasOcupadasFromVuelo(int numero_pasajeros, String id_vuelo);

    @Modifying
    @Transactional
    @Query(value = "UPDATE vuelos v SET plazas_ocupadas = plazas_ocupadas - 1 WHERE v.id_vuelo = :idVuelo ", nativeQuery = true)
    public void updatePlazasOcupadasMenosFromVuelo(String idVuelo);
    
    @Query(value = "SELECT v.id_vuelo, v.fecha_salida, v.hora_salida, v.fecha_llegada, v.hora_llegada, v.matricula_avion, v.plazas_ocupadas, v.id_programa"
    	+ "	    FROM reservas r, vuelos v"
    	+ "	    WHERE r.id_reserva = :idReserva AND r.id_vuelo = v.id_vuelo", nativeQuery = true)
    public Vuelo findIdVueloByIdReserva(String idReserva);

}
