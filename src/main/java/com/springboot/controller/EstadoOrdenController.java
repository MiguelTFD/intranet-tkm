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
import com.springboot.model.service.EstadoOrdenService;
@Controller
public class EstadoOrdenController {
	  @Autowired
	    private EstadoOrdenService estadoService;
		@GetMapping("/listadoorden")
		public String listado(Model modelo) {
			List<EstadoOrden> lista = estadoService.listado();
			modelo.addAttribute("listaEstudiantes", lista);
			return "carpetaEstadoOrden/listadoorden";
	        		}
	  @GetMapping("/nuevoestado")
	  public String nuevoEstado(Model modelo) {
			modelo.addAttribute("estudiante", new EstadoOrden());
			return "carpetaEstadoOrden/guardar";
	    }
		@PostMapping("/guardarestado")
		public String guardar(@ModelAttribute EstadoOrden e) {
			estadoService.guardar(e);
			return "redirect:/listadoorden";
		}
		@GetMapping("/editar/{id}")
		public String modificar(@PathVariable int id, Model modelo) {
			Optional<EstadoOrden> e = estadoService.buscarXid(id);
			modelo.addAttribute("estudiante", e.get());
			return "/carpetaEstadoOrden/guardar";
		}
		  @PostMapping("/actualizar/{id}")
		    public String actualizarEstadoOrden(@PathVariable("id") int id, @ModelAttribute("estados") EstadoOrden estado) {
		        estado.setId_estado(id);
		        estadoService.guardar(estado);
		        return "redirect:/listadoorden";
		    }
		    @GetMapping("/eliminar/{id}")
		    public String eliminarEstado(@PathVariable("id") int id) {
		        estadoService.borrarXid(id);
		        return "redirect:/listadoorden";
		    }
}
