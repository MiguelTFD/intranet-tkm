package com.springboot.model.service;

import java.util.List;
import java.util.Optional;

import com.springboot.model.entity.EstadoOrden;

public interface EstadoOrdenService {
    List<EstadoOrden> listado();
    Optional<EstadoOrden> buscarXid(int id);
    EstadoOrden guardar(EstadoOrden estado);
    void borrarXid(int id);

}
