package com.springboot.model.serviceImp;

import com.springboot.model.entity.EstadoOrden;
import com.springboot.model.repository.EstadoOrdenRepository;
import com.springboot.model.service.EstadoOrdenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstadoOrdenSeviceImp implements EstadoOrdenService {

    @Autowired
    private EstadoOrdenRepository estadoOrdenRepository;

    @Override
    public List<EstadoOrden> listado() {
        return estadoOrdenRepository.findAll();
    }

    @Override
    public Optional<EstadoOrden> buscarXid(int id) {
        return estadoOrdenRepository.findById(id);
    }

    @Override
    public EstadoOrden guardar(EstadoOrden estadoOrden) {
        return estadoOrdenRepository.save(estadoOrden);
    }

    @Override
    public void borrarXid(int id) {
        estadoOrdenRepository.deleteById(id);
    }
}
