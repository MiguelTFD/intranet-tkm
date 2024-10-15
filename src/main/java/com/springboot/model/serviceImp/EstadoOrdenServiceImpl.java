package com.springboot.model.serviceImp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.model.entity.EstadoOrden;
import com.springboot.model.repository.EstadoOrdenRepository;
import com.springboot.model.service.EstadoOrdenService;

@Service
public class EstadoOrdenServiceImpl implements EstadoOrdenService{
	   @Autowired
	    private EstadoOrdenRepository estadoRepository;
	@Override
	public List<EstadoOrden> listado() {
       return estadoRepository.findAll();
	}

	@Override
	public Optional<EstadoOrden> buscarXid(int id) {
		return estadoRepository.findById(id);
	}

	@Override
	public EstadoOrden guardar(EstadoOrden estado) {
		return estadoRepository.save(estado);

	}

	@Override
	public void borrarXid(int id) {
        estadoRepository.deleteById(id);
	}

}
