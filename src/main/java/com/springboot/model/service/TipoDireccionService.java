package com.springboot.model.service;

import com.springboot.model.entity.TipoDireccion;

import java.util.List;
import java.util.Optional;

public interface TipoDireccionService {
    List<TipoDireccion> listado();
    Optional<TipoDireccion> buscarXid(int id);
    TipoDireccion guardar(TipoDireccion tipoDireccion);
    void borrarXid(int id);
}
