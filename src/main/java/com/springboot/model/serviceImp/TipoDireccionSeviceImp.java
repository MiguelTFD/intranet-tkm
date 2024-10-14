package com.springboot.model.serviceImp;

import com.springboot.model.entity.TipoDireccion;
import com.springboot.model.repository.TipoDireccionRepository;
import com.springboot.model.service.TipoDireccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoDireccionSeviceImp  implements TipoDireccionService {

    @Autowired
    private TipoDireccionRepository tipoDireccionRepository;

    @Override
    public List<TipoDireccion> listado() {
        return tipoDireccionRepository.findAll();
    }

    @Override
    public Optional<TipoDireccion> buscarXid(int id) {
        return tipoDireccionRepository.findById(id);
    }

    @Override
    public TipoDireccion guardar(TipoDireccion tipoDireccion) {
        return tipoDireccionRepository.save(tipoDireccion);
    }

    @Override
    public void borrarXid(int id) {
        tipoDireccionRepository.deleteById(id);
    }
}
