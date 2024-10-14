package com.springboot.model.serviceImp;

import com.springboot.model.entity.Distrito;
import com.springboot.model.repository.DistritoRepository;
import com.springboot.model.service.DistritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class DistritoSeviceImp implements DistritoService {

    @Autowired
    private DistritoRepository distritoRepository;

    @Override
    public List<Distrito> listado() {
        return distritoRepository.findAll();
    }

    @Override
    public Optional<Distrito> buscaXid(int id) {
        return distritoRepository.findById(id);
    }

    @Override
    public Distrito guardar(Distrito distrito) {
        return distritoRepository.save(distrito);
    }

    @Override
    public void borrarXid(int id) {
        distritoRepository.deleteById(id);
    }
}
