package com.springboot.model.serviceImp;

import com.springboot.model.entity.TipoEntrega;
import com.springboot.model.repository.TipoEntregaRepository;
import com.springboot.model.service.TipoEntregaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoEntregaSeviceImp implements TipoEntregaService {

    @Autowired
    private TipoEntregaRepository tipoEntregaRepository;

    @Override
    public List<TipoEntrega> listado() {
        return tipoEntregaRepository.findAll();
    }

    @Override
    public Optional<TipoEntrega> buscarXid(int id) {
        return tipoEntregaRepository.findById(id);
    }

    @Override
    public TipoEntrega guardar(TipoEntrega tipoEntrega) {
        return tipoEntregaRepository.save(tipoEntrega);
    }

    @Override
    public void borrarXid(int id) {
        tipoEntregaRepository.deleteById(id);
    }
}
