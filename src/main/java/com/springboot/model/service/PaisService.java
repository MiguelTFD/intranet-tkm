package com.springboot.model.service;

import com.springboot.model.entity.Pais;

import java.util.List;

public interface PaisService {

    List<Pais> findAll();
    Pais findById(int id);
}
