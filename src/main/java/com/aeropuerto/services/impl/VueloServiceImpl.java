package com.aeropuerto.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aeropuerto.entitys.Vuelo;
import com.aeropuerto.respositories.IVueloDao;
import com.aeropuerto.services.IVueloService;

@Service
public class VueloServiceImpl implements IVueloService {

    @Autowired
    private IVueloDao iVueloDao;

    @Override
    public List<Vuelo> findVuelosBy(String origen, String destino, String fechaSalida, String horaSalida) {
	return iVueloDao.findVuelosBy(origen, destino, fechaSalida, horaSalida);
    }

    @Override
    public void updatePlazasOcupadasFromVuelo(String idVuelo, int plazasOcupadas) {
	iVueloDao.updatePlazasOcupadasFromVuelo(plazasOcupadas, idVuelo);
    }

    @Override
    public void updatePlazasOcupadasMenosFromVuelo(String idVuelo) {
	iVueloDao.updatePlazasOcupadasMenosFromVuelo(idVuelo);
    }
}
