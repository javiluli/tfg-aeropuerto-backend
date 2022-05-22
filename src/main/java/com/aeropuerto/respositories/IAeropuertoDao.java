package com.aeropuerto.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aeropuerto.entitys.Aeropuerto;

@Repository
public interface IAeropuertoDao extends JpaRepository<Aeropuerto, String> {}
