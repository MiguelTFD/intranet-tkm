package com.springboot.model.serviceImp;

import com.springboot.model.entity.DetalleOrden;
import com.springboot.model.repository.DetalleOrdenRepository;
import com.springboot.model.service.DetalleOrdenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DetalleOrdenSeviceImp implements DetalleOrdenService {

   @Autowired
   private DetalleOrdenRepository detalleOrdenRepository;

    @Override
    public List<DetalleOrden> listado() {
        return detalleOrdenRepository.findAll();
    }

    @Override
    public Optional<DetalleOrden> buscarXid(int id) {
        return detalleOrdenRepository.findById(id);
    }

    @Override
    public DetalleOrden guardar(DetalleOrden detalleOrden) {
        return detalleOrdenRepository.save(detalleOrden);
    }

    @Override
    public void borrarXid(int id) {
        detalleOrdenRepository.deleteById(id);
    }
}
