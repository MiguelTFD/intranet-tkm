package com.springboot.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "estadoOrden")
public class EstadoOrden {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEstado;

    @Column(name = "nombreEstado", nullable = false, unique = true)
    private String nombreEstado;

    public EstadoOrden() {
    }

    // Getters y setters


    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public String getNombreEstado() {
        return nombreEstado;
    }

    public void setNombreEstado(String nombreEstado) {
        this.nombreEstado = nombreEstado;
    }
}
