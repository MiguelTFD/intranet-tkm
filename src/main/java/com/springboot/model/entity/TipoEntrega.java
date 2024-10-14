package com.springboot.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tipoEntrega")
public class TipoEntrega {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoEntrega;

    @Column(name = "nombreTipo", nullable = false, unique = true)
    private String nombreTipo;

    public TipoEntrega() {
    }

    // Getters y setters

    public int getIdTipoEntrega() {
        return idTipoEntrega;
    }

    public void setIdTipoEntrega(int idTipoEntrega) {
        this.idTipoEntrega = idTipoEntrega;
    }

    public String getNombreTipo() {
        return nombreTipo;
    }

    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }
}
