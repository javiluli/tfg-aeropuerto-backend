package com.aeropuerto.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aeropuerto.entitys.Usuario;
import com.aeropuerto.models.dto.UsuarioDTO;
import com.aeropuerto.services.IUsuarioService;

@RestController
@CrossOrigin("*")
public class UsuarioController {

    @Autowired
    private IUsuarioService iUsuarioService;

//    @GetMapping("/usuario")
//    public ResponseEntity<List<Usuario>> findUsuarioVerificadoConRoles(@RequestBody UsuarioDTO usuarioDto) {
//	System.out.println(usuarioDto);
//	return new ResponseEntity<List<Usuario>>(iUsuarioService.findUsuarioVerificadoConRoles(usuarioDto), HttpStatus.OK);
//    }

    @PostMapping("/usuario")
    public ResponseEntity<UsuarioDTO> findUsuarioVerificadoConRoles(@RequestBody UsuarioDTO usuarioDto) {
	List<String> lRoles = new ArrayList<String>();
	List<Usuario> lUsuarios = iUsuarioService.findUsuarioVerificadoConRoles(usuarioDto);

	if (lUsuarios.size() > 0) {
	    for (Usuario usuario : lUsuarios) {
		lRoles.add(usuario.getRol().getDescripcion());
	    }
	    usuarioDto.setRoles(lRoles);
	} else {
	    return new ResponseEntity<UsuarioDTO>(usuarioDto, HttpStatus.NOT_FOUND);
	}
	return new ResponseEntity<UsuarioDTO>(usuarioDto, HttpStatus.OK);
    }

}
