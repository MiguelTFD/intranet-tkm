package com.springboot.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "distrito")
public class Distrito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDistrito;

    @Column(name = "nombreDistrito", nullable = false)
    private String nombreDistrito;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idProvincia", nullable = false)
    private Provincia provincia;

    public Distrito() {
    }

    public int getIdDistrito() {
        return idDistrito;
    }

    public void setIdDistrito(int idDistrito) {
        this.idDistrito = idDistrito;
    }

    public String getNombreDistrito() {
        return nombreDistrito;
    }

    public void setNombreDistrito(String nombreDistrito) {
        this.nombreDistrito = nombreDistrito;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }
}
