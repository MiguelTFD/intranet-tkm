package com.springboot.model.serviceImp;

import com.springboot.model.entity.OrdenCompra;
import com.springboot.model.repository.OrdenCompraRepository;
import com.springboot.model.service.OrdenCompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class OrdenCompraSeviceImp implements OrdenCompraService {

    @Autowired
    private OrdenCompraRepository ordenCompraRepository;

    @Override
    public List<OrdenCompra> listado() {
        return ordenCompraRepository.findAll();
    }

    @Override
    public Optional<OrdenCompra> buscarXid(int id) {
        return ordenCompraRepository.findById(id);
    }

    @Override
    public OrdenCompra guardar(OrdenCompra ordenCompra) {
        return ordenCompraRepository.save(ordenCompra);
    }

    @Override
    public void borrarXid(int id) {
        ordenCompraRepository.deleteById(id);
    }
}
