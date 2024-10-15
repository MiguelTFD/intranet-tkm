package com.springboot.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "departamento")
public class Departamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_departamento")
    private int id;

    @Column(name = "nombre_departamento")
    private String nombre_departamento;

    //-------
    // RelationShip(departamento *-----1 pais)
    @ManyToOne
    @JoinColumn(name = "id_pais")
    @JsonIgnore
    private Pais pais;

    // RelationShip(departamento 1-----* provincia)
    @OneToMany(mappedBy = "departamento")
    private List<Provincia> provincias;

    //================================

    //-----Constructor and getters/setters
    public Departamento() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_departamento() {
        return nombre_departamento;
    }

    public void setNombre_departamento(String nombre_departamento) {
        this.nombre_departamento = nombre_departamento;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public List<Provincia> getProvincias() {
        return provincias;
    }

    public void setProvincias(List<Provincia> provincias) {
        this.provincias = provincias;
    }
}
