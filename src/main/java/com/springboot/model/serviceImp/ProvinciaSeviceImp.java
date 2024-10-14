package com.springboot.model.serviceImp;

import com.springboot.model.entity.Provincia;
import com.springboot.model.repository.ProvinciaRepository;
import com.springboot.model.service.ProvinciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProvinciaSeviceImp implements ProvinciaService {

    @Autowired
    private ProvinciaRepository provinciaRepository;

    @Override
    public List<Provincia> listado() {
        return provinciaRepository.findAll();
    }

    @Override
    public Optional<Provincia> buscarXid(int id) {
        return provinciaRepository.findById(id);
    }

    @Override
    public Provincia guardar(Provincia provincia) {
        return provinciaRepository.save(provincia);
    }

    @Override
    public void borrarXid(int id) {
        provinciaRepository.deleteById(id);
    }
}
