package com.springboot.model.service;

import java.util.List;
import java.util.Optional;

import com.springboot.model.entity.TipoEntrega;

public interface TipoEntregaService {
    List<TipoEntrega> listado();
    Optional<TipoEntrega> buscarXid(int id);
    TipoEntrega guardar(TipoEntrega entrega);
    void borrarXid(int id);
}
