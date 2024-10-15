package com.springboot.model.serviceImp;

import com.springboot.model.entity.Provincia;
import com.springboot.model.repository.ProvinciaRepository;
import com.springboot.model.service.ProvinciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinciaServiceImp implements ProvinciaService {

    @Autowired
    private ProvinciaRepository provinciaRepository;

    @Override
    public List<Provincia> findByDepartamento_Id(int id_departamento) {
        return provinciaRepository.findByDepartamento_Id(id_departamento);
    }
}
