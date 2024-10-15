package com.springboot.model.service;

import com.springboot.model.entity.Departamento;

import java.util.List;


public interface DepartamentoService {
    List<Departamento> findByPais_Id(int id_pais);
}
