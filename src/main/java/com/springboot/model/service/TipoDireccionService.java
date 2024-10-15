package com.springboot.model.service;

import java.util.List;
import java.util.Optional;

import com.springboot.model.entity.TipoDireccion;

public interface TipoDireccionService {
    List<TipoDireccion> listado();
    Optional<TipoDireccion> buscarXid(int id);
    TipoDireccion guardar(TipoDireccion entrega);
    void borrarXid(int id);
}
