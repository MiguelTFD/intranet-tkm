package com.springboot.model.serviceImp;

import com.springboot.model.entity.DocIdentidad;
import com.springboot.model.repository.DocIdentidadRepository;
import com.springboot.model.service.DocIdentidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DocIdentidadSeviceImp implements DocIdentidadService {

    @Autowired
    private DocIdentidadRepository docIdentidadRepository;

    @Override
    public List<DocIdentidad> listado() {
        return docIdentidadRepository.findAll();
    }

    @Override
    public Optional<DocIdentidad> buscaXid(int id) {
        return docIdentidadRepository.findById(id);
    }

    @Override
    public DocIdentidad guardar(DocIdentidad docIdentidad) {
        return docIdentidadRepository.save(docIdentidad);
    }

    @Override
    public void borrarXid(int id) {
        docIdentidadRepository.deleteById(id);
    }
}
