package com.springboot.model.serviceImp;

import com.springboot.model.entity.Pais;
import com.springboot.model.repository.PaisRepository;
import com.springboot.model.service.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaisServiceImp implements PaisService {

    @Autowired
    private PaisRepository paisRepository;


    @Override
    public List<Pais> findAll() {
        return paisRepository.findAll();
    }

    @Override
    public Pais findById(int id) {
        return paisRepository.findById(id).orElse(null);
    }
}
