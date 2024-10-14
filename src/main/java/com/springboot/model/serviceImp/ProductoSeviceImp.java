package com.springboot.model.serviceImp;

import com.springboot.model.entity.Producto;
import com.springboot.model.repository.ProductoRepository;
import com.springboot.model.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoSeviceImp implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;


    @Override
    public List<Producto> listado() {
        return productoRepository.findAll();
    }

    @Override
    public Optional<Producto> buscarXid(int id) {
        return productoRepository.findById(id);
    }

    @Override
    public Producto guardar(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public void borrarXid(int id) {
        productoRepository.deleteById(id);
    }
}
