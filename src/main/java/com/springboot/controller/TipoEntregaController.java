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
import com.springboot.model.entity.TipoEntrega;
import com.springboot.model.service.TipoEntregaService;

@Controller
public class TipoEntregaController {
	@Autowired
	private TipoEntregaService entregaService;
	@GetMapping("/listadotipo")
	public String listado(Model modelo) {
		List<TipoEntrega> lista = entregaService.listado();
		modelo.addAttribute("listaEstudiantes", lista);
		return "carpetaTipoEntrega/listadotipo";
        		}
	  @GetMapping("/nuevotipo")
	  public String nuevoTipo(Model modelo) {
			modelo.addAttribute("estudiante", new TipoEntrega());
	        return "carpetaTipoEntrega/guardartipo";
	    }
	  @PostMapping("/guardartipo")
		public String guardar(@ModelAttribute TipoEntrega e) {
			entregaService.guardar(e);
			return "redirect:/listadotipo";
		}
	  @GetMapping("/editarentrega/{id}")
		public String modificar(@PathVariable int id, Model modelo) {
			Optional<TipoEntrega> e = entregaService.buscarXid(id);
			modelo.addAttribute("estudiante", e.get());
			return "/carpetaTipoEntrega/guardartipo";
		}
	  @PostMapping("/actualizartipo/{id}")
	  public String ActualizarTipoEntrega(@PathVariable("id") int id,@ModelAttribute("estados")TipoEntrega estado) {
		estado.setId_tipo_entrega(id);
		entregaService.guardar(estado);
        return "redirect:/listadotipo";

	}
    @GetMapping("/eliminartipo/{id}")
    public String eliminarEstado(@PathVariable("id") int id) {
        entregaService.borrarXid(id);
        return "redirect:/listadotipo";
    }
	  
}
