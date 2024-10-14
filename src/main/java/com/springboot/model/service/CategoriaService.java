package com.springboot.model.service;

import com.springboot.model.entity.Categoria;

import java.util.List;
import java.util.Optional;

public interface CategoriaService {
    List<Categoria> listado();
    Optional<Categoria> buscarXid(int id);
    Categoria guardar(Categoria categoria);
    void borrarXid(int id);
}
