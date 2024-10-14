package com.springboot.model.serviceImp;

import com.springboot.model.entity.Rol;
import com.springboot.model.repository.RolRepository;
import com.springboot.model.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RolSeviceImp implements RolService {

   @Autowired
    private RolRepository rolRepository;
    @Override
    public List<Rol> listado() {
        return rolRepository.findAll();
    }

    @Override
    public Optional<Rol> buscarXid(int id) {
        return rolRepository.findById(id);
    }

    @Override
    public Rol guardar(Rol rol) {
        return rolRepository.save(rol);
    }

    @Override
    public void borrarXid(int id) {
        rolRepository.deleteById(id);
    }

    @Override
    public Rol findByNombreRol(String nombreRol) {
        return rolRepository.findByNombreRol(nombreRol);
    }
}
