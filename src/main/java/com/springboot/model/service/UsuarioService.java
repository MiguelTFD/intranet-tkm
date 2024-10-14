package com.springboot.model.service;

import com.springboot.model.entity.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {
    List<Usuario> listado();
    Optional<Usuario> buscarXid(int id);
    Usuario guardar(Usuario usuario);
    void borrarXid(int id);
    Usuario findByUsername(String username);
}
