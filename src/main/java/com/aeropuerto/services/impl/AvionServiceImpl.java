package com.aeropuerto.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aeropuerto.respositories.IAvionDao;
import com.aeropuerto.services.IAvionService;

@Service
public class AvionServiceImpl implements IAvionService {

    @Autowired
    private IAvionDao iAvionDao;

}
