package com.springboot.model.serviceImp;

import com.springboot.model.entity.ImagenProducto;
import com.springboot.model.repository.ImagenProductoRepository;
import com.springboot.model.service.ImagenProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImagenProductoSeviceImp implements ImagenProductoService {

    @Autowired
    private ImagenProductoRepository imagenProductoRepository;

    @Override
    public List<ImagenProducto> listado() {
        return imagenProductoRepository.findAll();
    }

    @Override
    public Optional<ImagenProducto> buscarXid(int id) {
        return imagenProductoRepository.findById(id);
    }

    @Override
    public ImagenProducto guardar(ImagenProducto imagenProducto) {
        return imagenProductoRepository.save(imagenProducto);
    }

    @Override
    public void borrarXid(int id) {
        imagenProductoRepository.deleteById(id);
    }
}
