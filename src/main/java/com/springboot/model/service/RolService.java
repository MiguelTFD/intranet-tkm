package com.springboot.model.service;
import com.springboot.model.entity.Rol;

import java.util.List;
import java.util.Optional;

public interface RolService {
    List<Rol> listado();
    Optional<Rol> buscarXid(int id);
    Rol guardar(Rol rol);
    void borrarXid(int id);
    Rol findByNombreRol(String nombreRol);
}
