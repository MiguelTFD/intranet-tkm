package com.springboot.model.service;

import com.springboot.model.entity.Provincia;

import java.util.List;
import java.util.Optional;

public interface ProvinciaService {

    List<Provincia> listado();
    Optional<Provincia> buscarXid(int id);
    Provincia guardar(Provincia provincia);
    void borrarXid(int id);
}
