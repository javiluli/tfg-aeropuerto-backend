package com.aeropuerto.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.aeropuerto.entitys.Rol;

@Repository
public interface IRolDao extends JpaRepository<Rol, String> {

    @Query(value = "SELECT r.id_rol, r.descripcion FROM roles r WHERE r.id_rol = :idRol", nativeQuery = true)
    public Rol findRolByIdRol(String idRol);

}
