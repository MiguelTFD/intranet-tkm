package com.springboot.model.service;

import com.springboot.model.entity.DetalleOrden;
import com.springboot.model.entity.Direccion;

import java.util.List;
import java.util.Optional;

public interface DireccionService {
    List<Direccion> listado();
    Optional<Direccion> buscarXid(int id);
    Direccion guardar(Direccion direccion);
    void borrarXid(int id);

}
