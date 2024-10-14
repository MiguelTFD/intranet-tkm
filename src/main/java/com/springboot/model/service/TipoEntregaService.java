package com.springboot.model.service;

import com.springboot.model.entity.TipoDocumento;
import com.springboot.model.entity.TipoEntrega;

import java.util.List;
import java.util.Optional;

public interface TipoEntregaService {

    List<TipoEntrega> listado();
    Optional<TipoEntrega> buscarXid(int id);
    TipoEntrega guardar(TipoEntrega tipoEntrega);
    void borrarXid(int id);
}
