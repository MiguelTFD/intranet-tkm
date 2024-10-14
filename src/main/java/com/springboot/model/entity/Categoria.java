package com.springboot.model.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCategoria;

    @Column(name = "nombreCategoria",nullable = false,unique = true,length = 100)
    private String nombreCategoria;

    @OneToMany(mappedBy = "_usuario")
    private List<Producto> productos;

    public Categoria() {
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }
}
