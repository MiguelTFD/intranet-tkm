package com.springboot.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "detalleOrden")
@IdClass(DetalleOrdenId.class)  // Clase que manejará la llave compuesta
public class DetalleOrden {

    @Id
    @ManyToOne
    @JoinColumn(name = "idOrden", nullable = false)
    private OrdenCompra orden;

    @Id
    @ManyToOne
    @JoinColumn(name = "idProducto", nullable = false)
    private Producto producto;

    @Column(name = "cantidad", nullable = false)
    private int cantidad;

    public DetalleOrden() {
    }

    // Getters y setters

    public OrdenCompra getOrden() {
        return orden;
    }

    public void setOrden(OrdenCompra orden) {
        this.orden = orden;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}



