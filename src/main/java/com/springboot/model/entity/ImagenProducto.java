package com.springboot.model.entity;

import jakarta.persistence.*;

@Entity

@Table(name = "imagen_producto")
public class ImagenProducto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_imagen;

    @Column(name = "url_imagen", nullable = false)
    private String url_imagen;

    //----RelationShip(n-->1)

    @ManyToOne
    @JoinColumn(name = "id_producto", nullable = false)
    private Producto producto;
    //*****************************************
   //---Constructor
    public ImagenProducto() {
    }

    // Getters y setters


    public int getId_imagen() {
        return id_imagen;
    }

    public void setId_imagen(int id_imagen) {
        this.id_imagen = id_imagen;
    }

    public String getUrl_imagen() {
        return url_imagen;
    }

    public void setUrl_imagen(String url_imagen) {
        this.url_imagen = url_imagen;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
