package com.springboot.model.service;

import com.springboot.model.entity.Distrito;

import java.util.List;

public interface DistritoService {
    List<Distrito> findByProvincia_Id(int id_provincia);
}
