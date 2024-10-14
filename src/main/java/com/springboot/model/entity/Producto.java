package com.springboot.model.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProducto;

    @Column(name = "nombreProducto", nullable = false)
    private String nombreProducto;

    @Column(name = "stockProducto", nullable = false)
    private int stockProducto;

    @Column(name = "precioUni", nullable = false)
    private double precioUni;

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
    @JoinColumn(name = "idCategoria")
    private Usuario usuario;

    public Producto() {
    }

    // Getters y setters

}
