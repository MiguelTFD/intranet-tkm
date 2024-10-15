package com.springboot.model.serviceImp;

import com.springboot.model.entity.Distrito;
import com.springboot.model.repository.DistritoRepository;
import com.springboot.model.service.DistritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistritoServiceImp implements DistritoService {

    @Autowired
    private DistritoRepository distritoRepository;

    @Override
    public List<Distrito> findByProvincia_Id(int id_provincia) {
        return distritoRepository.findByProvincia_Id(id_provincia);
    }

}
