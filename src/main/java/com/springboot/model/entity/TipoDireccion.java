package com.springboot.model.entity;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "tipoDireccion")
public class TipoDireccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoDireccion;

    @Column(name = "nombreTipo", nullable = false, unique = true)
    private String nombreTipo;

    @OneToMany(mappedBy = "tipoDireccion", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Direccion> direcciones;

    public TipoDireccion() {
    }

    // Getters y setters

    public int getIdTipoDireccion() {
        return idTipoDireccion;
    }

    public void setIdTipoDireccion(int idTipoDireccion) {
        this.idTipoDireccion = idTipoDireccion;
    }

    public String getNombreTipo() {
        return nombreTipo;
    }

    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }

    public Set<Direccion> getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(Set<Direccion> direcciones) {
        this.direcciones = direcciones;
    }
}
