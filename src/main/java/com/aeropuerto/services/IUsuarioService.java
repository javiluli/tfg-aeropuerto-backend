package com.aeropuerto.services;

import java.util.List;

import com.aeropuerto.entitys.Usuario;
import com.aeropuerto.models.dto.UsuarioDTO;

public interface IUsuarioService {

    public List<Usuario> findUsuarioVerificadoConRoles(UsuarioDTO usuarioDto);

}
