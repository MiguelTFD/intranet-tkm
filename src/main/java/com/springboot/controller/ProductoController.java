package com.springboot.controller;

import com.springboot.model.entity.Producto;
import com.springboot.model.entity.Categoria;
import com.springboot.model.service.ProductoService;
import com.springboot.model.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public String listarProductos(Model model) {
        List<Producto> productos = productoService.listado();
        model.addAttribute("productos", productos);
        return "carpetaProducto/listarProducto";
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioProducto(Model model) {
        Producto producto = new Producto();
        List<Categoria> categorias = categoriaService.listado();
        model.addAttribute("producto", producto);
        model.addAttribute("categorias", categorias);
        return "carpetaProducto/nuevoProducto";
    }

    @PostMapping
    public String guardarProducto(@ModelAttribute("producto") Producto producto) {
        productoService.guardar(producto);
        return "redirect:/producto";
    }

    @GetMapping("/editar/{id}")
    public String mostrarFormularioEdicion(@PathVariable("id") int id, Model model) {
        Optional<Producto> producto = productoService.buscarXid(id);
        if (producto.isPresent()) {
            List<Categoria> categorias = categoriaService.listado();
            model.addAttribute("producto", producto.get());
            model.addAttribute("categorias", categorias);
            return "carpetaProducto/editarProducto";
        } else {
            return "redirect:/producto";
        }
    }

    @PostMapping("/actualizar/{id}")
    public String actualizarProducto(@PathVariable("id") int id, @ModelAttribute("producto") Producto producto) {
        producto.setIdProducto(id);
        productoService.guardar(producto);
        return "redirect:/producto";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarProducto(@PathVariable("id") int id) {
        productoService.borrarXid(id);
        return "redirect:/producto";
    }
}
