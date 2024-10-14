package com.springboot.model.service;

import com.springboot.model.entity.ImagenProducto;

import java.util.List;
import java.util.Optional;

public interface ImagenProductoService {
    List<ImagenProducto> listado();
    Optional<ImagenProducto> buscarXid(int id);
    ImagenProducto guardar(ImagenProducto imagenProducto);
    void borrarXid(int id);
}
