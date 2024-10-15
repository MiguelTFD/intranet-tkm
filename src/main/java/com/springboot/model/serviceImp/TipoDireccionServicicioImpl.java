package com.springboot.model.serviceImp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.model.entity.TipoDireccion;
import com.springboot.model.repository.TipoDireccionRepository;
import com.springboot.model.repository.TipoEntegaRepository;
import com.springboot.model.service.TipoDireccionService;

@Service
public class TipoDireccionServicicioImpl implements TipoDireccionService {
	@Autowired
	private TipoDireccionRepository direccionrepository; 
	@Override
	public List<TipoDireccion> listado() {
		return direccionrepository.findAll();
	}

	@Override
	public Optional<TipoDireccion> buscarXid(int id) {
		return direccionrepository.findById(id);
		
	}

	@Override
	public TipoDireccion guardar(TipoDireccion entrega) {
		return direccionrepository.save(entrega);
	}

	@Override
	public void borrarXid(int id) {
		direccionrepository.deleteById(id);
	}

}
