package com.springboot.model.serviceImp;

import com.springboot.model.entity.Direccion;
import com.springboot.model.repository.DireccionRepository;
import com.springboot.model.service.DireccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DireccionSeviceImp implements DireccionService {

    @Autowired
    private DireccionRepository direccionRepository;

    @Override
    public List<Direccion> listado() {
        return direccionRepository.findAll();
    }

    @Override
    public Optional<Direccion> buscarXid(int id) {
        return direccionRepository.findById(id);
    }

    @Override
    public Direccion guardar(Direccion direccion) {
        return direccionRepository.save(direccion);
    }

    @Override
    public void borrarXid(int id) {
        direccionRepository.deleteById(id);
    }
}
