package com.aeropuerto.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aeropuerto.entitys.Valoracion;

@Repository
public interface IValoracionDao extends JpaRepository<Valoracion, String> {
}
