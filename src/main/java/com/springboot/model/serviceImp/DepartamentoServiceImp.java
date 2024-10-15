package com.springboot.model.serviceImp;

import com.springboot.model.entity.Departamento;
import com.springboot.model.repository.DepartamentoRepository;
import com.springboot.model.service.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartamentoServiceImp implements DepartamentoService {

    @Autowired
    private DepartamentoRepository departamentoRepository;

    @Override
    public List<Departamento> findByPais_Id(int id_pais) {
        return departamentoRepository.findByPais_Id(id_pais);
    }
}
