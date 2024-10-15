package com.springboot.model.service;

import com.springboot.model.entity.Provincia;

import java.util.List;

public interface ProvinciaService {
    List<Provincia> findByDepartamento_Id(int id_departamento);
}
