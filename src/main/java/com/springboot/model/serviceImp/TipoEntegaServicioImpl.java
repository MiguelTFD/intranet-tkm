package com.springboot.model.serviceImp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.model.entity.TipoEntrega;
import com.springboot.model.repository.TipoEntegaRepository;
import com.springboot.model.service.TipoEntregaService;

@Service
public class TipoEntegaServicioImpl implements TipoEntregaService{
@Autowired
private TipoEntegaRepository tiporepository;
	@Override
	public List<TipoEntrega> listado() {
		return tiporepository.findAll();
	}

	@Override
	public Optional<TipoEntrega> buscarXid(int id) {
		return tiporepository.findById(id);
	}

	@Override
	public TipoEntrega guardar(TipoEntrega entrega) {
		return tiporepository.save(entrega);
	}

	@Override
	public void borrarXid(int id) {
		tiporepository.deleteById(id);
	}

}
