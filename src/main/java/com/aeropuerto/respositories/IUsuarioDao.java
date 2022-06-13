package com.aeropuerto.respositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.aeropuerto.entitys.Usuario;

@Repository
public interface IUsuarioDao extends JpaRepository<Usuario, String> {

    @Query(value = "SELECT u.id_usuario, u.nombre, u.password, u.id_rol"
	    	+ " FROM usuarios u"
	    	+ " WHERE u.nombre = :nombre AND u.password = :password", nativeQuery = true)
    public List<Usuario> findUsuarioVerificadoConRoles(String nombre, String password);

}
