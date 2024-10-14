package com.springboot.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "imagenProducto")
public class ImagenProducto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idImagen;

    @ManyToOne
    @JoinColumn(name = "idProducto", nullable = false)
    private Producto producto;

    @Column(name = "urlImagen", nullable = false)
    private String urlImagen;

    public ImagenProducto() {
    }

    // Getters y setters


    public int getIdImagen() {
        return idImagen;
    }

    public void setIdImagen(int idImagen) {
        this.idImagen = idImagen;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }
}
