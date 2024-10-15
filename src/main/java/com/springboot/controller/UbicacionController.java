package com.springboot.controller;

import com.springboot.model.entity.Departamento;
import com.springboot.model.entity.Distrito;
import com.springboot.model.entity.Pais;
import com.springboot.model.entity.Provincia;
import com.springboot.model.service.DepartamentoService;
import com.springboot.model.service.DistritoService;
import com.springboot.model.service.PaisService;
import com.springboot.model.service.ProvinciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/ubicacion")
public class UbicacionController {

    @Autowired
    private PaisService paisService;

    @Autowired
    private DepartamentoService departamentoService;

    @Autowired
    private ProvinciaService provinciaService;

    @Autowired
    private DistritoService distritoService;


    @GetMapping("/form")
    public String showForm(Model model) {
        List<Pais> paises = paisService.findAll();
        model.addAttribute("paises", paises);
        return "ubicacionForm";
    }

    // Método para obtener departamentos según el país seleccionado
    @GetMapping("/paises/{id}/departamentos")
    @ResponseBody
    public List<Departamento> getDepartamentosByPais(@PathVariable int id) {
        System.out.println("Departamentos del país con ID " + id + ": " + departamentoService.findByPais_Id(id)); // Mostrar departamentos para el país
        return departamentoService.findByPais_Id(id);
    }

    // Método para obtener provincias según el departamento seleccionado
    @GetMapping("/departamentos/{id}/provincias")
    @ResponseBody
    public List<Provincia> getProvinciasByDepartamento(@PathVariable int id) {
        System.out.println("Provincias del Departamento con ID " + id + ": " + provinciaService.findByDepartamento_Id(id)); // Mostrar departamentos para el país
        return provinciaService.findByDepartamento_Id(id);
    }

    // ==================Método para obtener distritos según provincia seleccionado
    @GetMapping("/provincias/{id}/distritos")
    @ResponseBody
    public List<Distrito> getDistritosByProvincia(@PathVariable int id) {
        System.out.println("Provincias del Departamento con ID " + id + ": " + distritoService.findByProvincia_Id(id)); // Mostrar departamentos para el país
        return distritoService.findByProvincia_Id(id);
    }

}
