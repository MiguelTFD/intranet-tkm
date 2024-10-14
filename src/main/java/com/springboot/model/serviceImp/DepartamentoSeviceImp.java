package com.springboot.model.serviceImp;

import com.springboot.model.entity.Departamento;
import com.springboot.model.repository.DepartamentoRepository;
import com.springboot.model.service.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartamentoSeviceImp implements DepartamentoService {

    @Autowired
    private DepartamentoRepository departamentoRepository;


    @Override
    public List<Departamento> listado() {
        return departamentoRepository.findAll();
    }

    @Override
    public Optional<Departamento> buscarXid(int id) {
        return departamentoRepository.findById(id);
    }

    @Override
    public Departamento guardar(Departamento departamento) {
        return departamentoRepository.save(departamento);
    }

    @Override
    public void eliminarXid(int id) {
        departamentoRepository.deleteById(id);
    }
}
