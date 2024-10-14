package com.springboot.model.service;

import com.springboot.model.entity.Distrito;

import java.util.List;
import java.util.Optional;

public interface DistritoService {
    List<Distrito> listado();
    Optional<Distrito> buscaXid(int id);
    Distrito guardar(Distrito distrito);
    void borrarXid(int id);
}
