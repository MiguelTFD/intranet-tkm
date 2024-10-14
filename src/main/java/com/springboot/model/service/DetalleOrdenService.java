package com.springboot.model.service;

import com.springboot.model.entity.DetalleOrden;

import java.util.List;
import java.util.Optional;

public interface DetalleOrdenService {
    List<DetalleOrden> listado();
    Optional<DetalleOrden> buscarXid(int id);
    DetalleOrden guardar(DetalleOrden detalleOrden);
    void borrarXid(int id);
}
