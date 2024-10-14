package com.springboot.model.service;

import com.springboot.model.entity.Distrito;
import com.springboot.model.entity.DocIdentidad;

import java.util.List;
import java.util.Optional;

public interface DocIdentidadService {

    List<DocIdentidad> listado();
    Optional<DocIdentidad> buscaXid(int id);
    DocIdentidad guardar(DocIdentidad docIdentidad);
    void borrarXid(int id);

}
