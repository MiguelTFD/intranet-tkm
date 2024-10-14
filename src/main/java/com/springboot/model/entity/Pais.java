package com.springboot.model.entity;

import jakarta.persistence.*;

import java.util.Set;


@Entity
@Table(name="pais")
public class Pais{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idPais;

    @Column(name="nombrePais",nullable=false,unique=true)
    private String nombrePais;

    @OneToMany(mappedBy = "pais", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Departamento> departamentos;

    public Pais() {
    }

    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public Set<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Set<Departamento> departamentos) {
        this.departamentos = departamentos;
    }
}

