package com.springboot.model.service;

import com.springboot.model.entity.Pais;

import java.util.List;
import java.util.Optional;

public interface PaisService {
    List<Pais> listado();
    Optional<Pais> buscarXid(int id);
    Pais guardar(Pais pais);
    void eliminarXid(int id);
}
