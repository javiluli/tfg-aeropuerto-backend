package com.aeropuerto.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aeropuerto.entitys.Asiento;
import com.aeropuerto.entitys.primaryKeys.IdAsiento;

@Repository
public interface IAsientoDao extends JpaRepository<Asiento, IdAsiento> {}
