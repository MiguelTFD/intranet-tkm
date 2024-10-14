package com.springboot.model.service;

import com.springboot.model.entity.Rol;
import com.springboot.model.entity.TipoDocumento;

import java.util.List;
import java.util.Optional;

public interface TipoDocumentoService {
    List<TipoDocumento> listado();
    Optional<TipoDocumento> buscarXid(int id);
    TipoDocumento guardar(TipoDocumento tipoDocumento);
    void borrarXid(int id);
}
