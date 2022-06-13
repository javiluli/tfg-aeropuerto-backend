package com.aeropuerto.respositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aeropuerto.entitys.Programa;

@Repository
public interface IProgramaDao extends JpaRepository<Programa, String> {

    public List<Programa> findAll();

}
