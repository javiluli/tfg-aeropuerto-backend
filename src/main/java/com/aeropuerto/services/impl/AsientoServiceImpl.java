package com.aeropuerto.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aeropuerto.entitys.Asiento;
import com.aeropuerto.models.dto.AsientoDTO;
import com.aeropuerto.models.dto.FilaDTO;
import com.aeropuerto.respositories.IAsientoDao;
import com.aeropuerto.services.IAsientoService;

@Service
public class AsientoServiceImpl implements IAsientoService {

    @Autowired
    private IAsientoDao iAsientoDao;

    @Override
    public List<AsientoDTO> findAsientosByNombreModelo(String nombreModelo) {
	List<Asiento> lAsientos = iAsientoDao.findAsientosByNombreModelo(nombreModelo);

	List<AsientoDTO> lAsientosDto = new ArrayList<AsientoDTO>();
	List<FilaDTO> lFilasDto = new ArrayList<FilaDTO>();
	List<String> lbutacas = new ArrayList<String>();

//	for (Asiento asiento : lAsientos) {
//	    AsientoDTO asientoDto = new AsientoDTO();
//	    asientoDto.setNumerofila(asiento.getFila().getNumeroFila());
//	    asientoDto.setLetraAsiento(asiento.getLetraAsiento());
//	    asientoDto.setNombreModelo(nombreModelo);
//	    lAsientosDto.add(asientoDto);
//	}

	int i = 0;
	if (lAsientos.size() > 0) {

	    // primer elemento de la lista
	    String numeroFila = lAsientos.get(0).getFila().getNumeroFila();

	    System.out.println(numeroFila);

	    while (i < lAsientos.size()) {
		if (lAsientos.get(i).getFila().getNumeroFila().equals(numeroFila)) {
		    String butaca = lAsientos.get(i).getFila().getNumeroFila() + "-"
			    + lAsientos.get(i).getLetraAsiento();
		    lbutacas.add(butaca);
		    i++;
		    System.out.println(butaca);

		} else {
		    FilaDTO filaDto = new FilaDTO();
		    filaDto.setNumeroFila(numeroFila);
		    filaDto.setButacas(lbutacas);

		    System.out.println(numeroFila);
		    System.out.println(lbutacas);

		    lFilasDto.add(filaDto);
		    System.out.println(filaDto);

		    System.out.println("------------------");
		    System.out.println("------------------");
		    System.out.println(numeroFila);
		    numeroFila = lAsientos.get(i).getFila().getNumeroFila();
		    System.out.println(numeroFila);
		    System.out.println("------------------");
		    System.out.println("------------------");
		    lbutacas.clear();
		}
	    }
	}

	for (FilaDTO fila : lFilasDto) {
	    System.out.println(fila);
	}

	return lAsientosDto;
    }

    @Override
    public List<String> findLetraAsientoByNombreModeloAndNumeroFila(String nombreModelo, String numeroFila) {
	return iAsientoDao.findLetraAsientoByNombreModeloAndNumeroFila(nombreModelo, numeroFila);
    }

}
