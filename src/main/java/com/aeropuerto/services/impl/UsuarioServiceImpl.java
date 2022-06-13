package com.aeropuerto.services.impl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aeropuerto.entitys.Usuario;
import com.aeropuerto.models.dto.UsuarioDTO;
import com.aeropuerto.respositories.IUsuarioDao;
import com.aeropuerto.services.IUsuarioService;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

    @Autowired
    private IUsuarioDao iUsuarioDao;

    @Override
    public List<Usuario> findUsuarioVerificadoConRoles(UsuarioDTO usuarioDto) {
	ModelMapper modelMapper = new ModelMapper();
	Usuario usuario = modelMapper.map(usuarioDto, Usuario.class);
	return iUsuarioDao.findUsuarioVerificadoConRoles(usuario.getNombre(), usuario.getPassword());
    }

}
