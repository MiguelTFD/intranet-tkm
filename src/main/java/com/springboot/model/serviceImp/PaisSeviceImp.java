package com.springboot.model.serviceImp;

import com.springboot.model.entity.Pais;
import com.springboot.model.repository.PaisRepository;
import com.springboot.model.service.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaisSeviceImp implements PaisService {

    @Autowired
    private PaisRepository paisRepository;

    @Override
    public List<Pais> listado() {
        return paisRepository.findAll();
    }

    @Override
    public Optional<Pais> buscarXid(int id) {
        return paisRepository.findById(id);
    }

    @Override
    public Pais guardar(Pais pais) {
        return paisRepository.save(pais);
    }

    @Override
    public void eliminarXid(int id) {
        paisRepository.deleteById(id);
    }
}
