package com.springboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.model.entity.EstadoOrden;
import com.springboot.model.entity.TipoDireccion;
import com.springboot.model.entity.TipoEntrega;
import com.springboot.model.service.TipoDireccionService;

@Controller
public class TipoDireccionController {
@Autowired
private TipoDireccionService direccionreservicey;

@GetMapping("/listadodireccion")
	public String listado(Model modelo) {
	List<TipoDireccion> lista = direccionreservicey.listado();
	modelo.addAttribute("listaEstudiantes", lista);
	return "carpetaDireccion/listadodireccion";
}


@GetMapping("/nuevodireccion")
public String nuevoEstado(Model modelo) {
		modelo.addAttribute("estudiante", new TipoDireccion());
		return "carpetaDireccion/guardardireccion";
  }
@PostMapping("/guardardireccion")
public String guardar(@ModelAttribute TipoDireccion e) {
	direccionreservicey.guardar(e);
	return "redirect:/listadodireccion";
}
@GetMapping("/editardireccion/{id}")
public String modificar(@PathVariable int id, Model modelo) {
	Optional<TipoDireccion> e = direccionreservicey.buscarXid(id);
	modelo.addAttribute("estudiante", e.get());
	return "/carpetaDireccion/guardardireccion";
}
@PostMapping("/actualizardireccion/{id}")
public String actualizarEstadoOrden(@PathVariable("id") int id, @ModelAttribute("estados") TipoDireccion estado) {
    estado.setId_tipo_direccion(id);
    direccionreservicey.guardar(estado);
    return "redirect:/listadodireccion";
}
@GetMapping("/eliminardireccion/{id}")
public String eliminarEstado(@PathVariable("id") int id) {
    direccionreservicey.borrarXid(id);
    return "redirect:/listadodireccion";
}

}
