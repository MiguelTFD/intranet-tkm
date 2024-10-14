package com.springboot.model.service;

import com.springboot.model.entity.Departamento;

import java.util.List;
import java.util.Optional;

public interface DepartamentoService {
    List<Departamento> listado();
    Optional<Departamento> buscarXid(int id);
    Departamento guardar(Departamento departamento);
    void eliminarXid(int id);
}
