package com.springboot.model.serviceImp;

import com.springboot.model.entity.Usuario;
import com.springboot.model.repository.UsuarioRepository;
import com.springboot.model.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioSeviceImp implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> listado() {
        return usuarioRepository.findAll();
    }

    @Override
    public Optional<Usuario> buscarXid(int id) {
        return usuarioRepository.findById(id);
    }

    @Override
    public Usuario guardar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public void borrarXid(int id) {
        usuarioRepository.deleteById(id);
    }

    @Override
    public Usuario findByUsername(String username) {
        return usuarioRepository.findByUsername(username);
    }


}
