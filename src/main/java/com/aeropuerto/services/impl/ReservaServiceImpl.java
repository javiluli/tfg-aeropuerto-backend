package com.aeropuerto.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aeropuerto.entitys.Checkin;
import com.aeropuerto.entitys.Fila;
import com.aeropuerto.entitys.Pasajero;
import com.aeropuerto.entitys.Reserva;
import com.aeropuerto.entitys.Vuelo;
import com.aeropuerto.models.dto.CheckinDTO;
import com.aeropuerto.models.dto.FilaDTO;
import com.aeropuerto.models.dto.PasajeroDTO;
import com.aeropuerto.models.dto.ReservaDTO;
import com.aeropuerto.models.dto.ReservaDTOBusquedaCheckin.ReservaDTO_Busqueda_Checkin;
import com.aeropuerto.models.dto.ReservaDTOBusquedaCheckin.VueloDTO_Simple;
import com.aeropuerto.respositories.IAsientoDao;
import com.aeropuerto.respositories.ICheckinDao;
import com.aeropuerto.respositories.IFilaDao;
import com.aeropuerto.respositories.IModeloAvionDao;
import com.aeropuerto.respositories.IPasajeroDao;
import com.aeropuerto.respositories.IReservaDao;
import com.aeropuerto.respositories.IVueloDao;
import com.aeropuerto.services.IReservaService;

@Service
public class ReservaServiceImpl implements IReservaService {

    @Autowired
    private IReservaDao iReservaDao;

    @Autowired
    private IVueloDao iVueloDao;

    @Autowired
    private IPasajeroDao iPasajeroDao;

    @Autowired
    private ICheckinDao iCheckinDao;

    @Autowired
    private IModeloAvionDao iModeloAvionDao;

    @Autowired
    private IFilaDao iFilaDao;

    @Autowired
    private IAsientoDao iAsientoDao;

    @Override
    public void saveReservaDto(ReservaDTO reservaDto) {
	ModelMapper modelMapper = new ModelMapper();
	Reserva reserva = modelMapper.map(reservaDto, Reserva.class);
	iReservaDao.saveReservaDto(reserva.getIdReserva(), reserva.getFechaReserva(), reserva.getVuelo().getIdVuelo());
    }

    @Override
    public Reserva findPasajeroByIdReserva(String idReserva) {
	return iReservaDao.findByReserva(idReserva);
    }

    @Override
    public void eliminarReservaByIdReserva(String idReserva) {
	iReservaDao.eliminarReservaByIdReserva(idReserva);
    }

    @Override
    public ReservaDTO_Busqueda_Checkin findReservaByIdReserva(String idReserva) {
	ModelMapper modelMapper = new ModelMapper();
	ReservaDTO_Busqueda_Checkin reserva = new ReservaDTO_Busqueda_Checkin();

	// id de la reserva
	reserva.setIdReserva(idReserva);

	// vuelo asociado a la reserva
	Vuelo vuelo = iVueloDao.findIdVueloByIdReserva(idReserva);
	VueloDTO_Simple VueloDtoSimple = modelMapper.map(vuelo, VueloDTO_Simple.class);
	reserva.setVuelo(VueloDtoSimple);

	// pasajeros
	List<Pasajero> lPasajeros = iPasajeroDao.findPasajerosByIdReserva(idReserva);
	TypeToken<List<PasajeroDTO>> typeToken = new TypeToken<List<PasajeroDTO>>() {
	};
	List<PasajeroDTO> lPasajeroDto = modelMapper.map(lPasajeros, typeToken.getType());
	reserva.setPasajeros(lPasajeroDto);

	// checkins
	List<Checkin> lCheckins = iCheckinDao.findCheckinsByIdReserva(idReserva);
	List<CheckinDTO> lCheckinDto = new ArrayList<CheckinDTO>();
	CheckinDTO checkinDto = new CheckinDTO();

	for (Checkin checkin : lCheckins) {
	    checkinDto.setIdVuelo(checkin.getVuelo().getIdVuelo());
	    checkinDto.setNombreModelo(checkin.getVuelo().getAvion().getModeloAvion().getNombreModelo());
	    checkinDto.setNumeroFila(checkin.getAsiento().getFila().getNumeroFila());
	    checkinDto.setLetraAsiento(checkin.getAsiento().getLetraAsiento());
	    checkinDto.setIdReserva(checkin.getReserva().getIdReserva());
	    lCheckinDto.add(checkinDto);
	}
	reserva.setCheckins(lCheckinDto);

	String modeloAvion = iModeloAvionDao.findModelosAvionByIdReserva(idReserva);
	reserva.setModeloAvion(modeloAvion);

	System.out.println(modeloAvion);

	Fila fila = iFilaDao.obtenerMaxNumeroFilaYCantidadAsientosByNombreModelo(modeloAvion);
	System.out.println(fila);

	FilaDTO filaDto = null;
	List<FilaDTO> filas = new ArrayList<FilaDTO>();

	for (int i = 0; i < Integer.parseInt(fila.getNumeroFila()); i++) {
	    filaDto = new FilaDTO();
	    String numeroFila = i < 10 ? "0" + String.valueOf(i + 1) : String.valueOf(i + 1);
	    List<String> lAsientos = iAsientoDao.findLetraAsientoByNombreModeloAndNumeroFila(modeloAvion, numeroFila);
	    filaDto.setNumeroFila(numeroFila);
	    filaDto.setButacas(lAsientos);
	    filas.add(filaDto);
	}

	reserva.setFilas(filas);

	return reserva;
    }

}
