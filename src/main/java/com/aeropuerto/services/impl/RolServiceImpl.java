package com.aeropuerto.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aeropuerto.entitys.Rol;
import com.aeropuerto.respositories.IRolDao;
import com.aeropuerto.services.IRolService;

@Service
public class RolServiceImpl implements IRolService {

    @Autowired
    private IRolDao iRolDao;

    @Override
    public Rol findRolByIdRol(String idRol) {
	return iRolDao.findRolByIdRol(idRol);
    }

}
