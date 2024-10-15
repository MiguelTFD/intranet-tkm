package com.springboot.model.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_producto;

    @Column(name = "nombre_producto", nullable = false)
    private String nombre_producto;

    @Column(name = "stock_producto", nullable = false)
    private int stock_producto;

    @Column(name = "precio_uni", nullable = false)
    private double precio_uni;

    @Column(name = "descuento")
    private double descuento;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "tamanio")
    private String tamanio;

    @Column(name = "peso")
    private double peso;

    //---Relationship---

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;

    @OneToMany(mappedBy = "producto")
    private List<ImagenProducto> imagen_productos;

    //********************************

    ///-----Construcctor-------
    public Producto() {
    }

    //------setters and getters----

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public int getStock_producto() {
        return stock_producto;
    }

    public void setStock_producto(int stock_producto) {
        this.stock_producto = stock_producto;
    }

    public double getPrecio_uni() {
        return precio_uni;
    }

    public void setPrecio_uni(double precio_uni) {
        this.precio_uni = precio_uni;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public List<ImagenProducto> getImagen_productos() {
        return imagen_productos;
    }

    public void setImagen_productos(List<ImagenProducto> imagen_productos) {
        this.imagen_productos = imagen_productos;
    }

    // Getters y setters

}
