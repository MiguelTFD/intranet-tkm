package com.springboot.model.serviceImp;

import com.springboot.model.entity.Categoria;
import com.springboot.model.repository.CategoriaRepository;
import com.springboot.model.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaSeviceImp implements CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public List<Categoria> listado() {
        return categoriaRepository.findAll();
    }

    @Override
    public Optional<Categoria> buscarXid(int id) {
        return categoriaRepository.findById(id);
    }

    @Override
    public Categoria guardar(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    @Override
    public void borrarXid(int id) {
        categoriaRepository.deleteById(id);
    }
}
