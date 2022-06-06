package com.aeropuerto.respositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.aeropuerto.entitys.Checkin;
import com.aeropuerto.entitys.primaryKeys.IdCheckin;

@Repository
public interface ICheckinDao extends JpaRepository<Checkin, IdCheckin> {

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO checkin VALUES ( :idVuelo, :nombreModelo, :numeroFila, :letraAsiento )", nativeQuery = true)
    public void saveCheckinDto(String idVuelo, String nombreModelo, String numeroFila, String letraAsiento);

    @Query(value = "SELECT c.* FROM checkin c WHERE c.id_vuelo = :idVuelo AND c.nombre_modelo = :nombreModelo", nativeQuery = true)
    public List<Checkin> findCheckinsByIdVueloAndNombreModelo(String idVuelo, String nombreModelo);

}
