package com.springboot.model.service;

import com.springboot.model.entity.OrdenCompra;

import java.util.List;
import java.util.Optional;

public interface OrdenCompraService {
    List<OrdenCompra> listado();
    Optional<OrdenCompra> buscarXid(int id);
    OrdenCompra guardar(OrdenCompra ordenCompra);
    void borrarXid(int id);
}
