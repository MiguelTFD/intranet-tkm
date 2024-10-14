package com.springboot.model.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name="departamento")
public class Departamento{
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idDepartamento;

    @Column(name="nombreDepartamento",nullable = false)
    private String nombreDepartamento;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idPais", nullable = false)
    private Pais pais;

    @OneToMany(mappedBy = "departamento", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Provincia> provincias;

    ///-------------

    public Departamento() {
    }

    //------


    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public Set<Provincia> getProvincias() {
        return provincias;
    }

    public void setProvincias(Set<Provincia> provincias) {
        this.provincias = provincias;
    }
}
