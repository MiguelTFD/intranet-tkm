package com.springboot.model.service;

import com.springboot.model.entity.DetalleOrden;
import com.springboot.model.entity.EstadoOrden;

import java.util.List;
import java.util.Optional;

public interface EstadoOrdenService {
    List<EstadoOrden> listado();
    Optional<EstadoOrden> buscarXid(int id);
    EstadoOrden guardar(EstadoOrden estadoOrden);
    void borrarXid(int id);
}
