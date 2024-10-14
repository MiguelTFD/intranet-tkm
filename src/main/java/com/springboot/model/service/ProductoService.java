package com.springboot.model.service;

import com.springboot.model.entity.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoService {
    List<Producto> listado();
    Optional<Producto> buscarXid(int id);
    Producto guardar(Producto producto);
    void borrarXid(int id);
}
