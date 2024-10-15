package com.springboot.model.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "pais")
public class Pais {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pais")
    private int id;

    @Column(name = "nombre_pais")
    private String nombre_pais;

    //----RelationShip(pais 1 -------* departamento)
    @OneToMany(mappedBy = "pais")
    private List<Departamento> departamentos;

    //********************

   public Pais() {

   }

    //----------

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(List<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id= id;
    }

    public String getNombre_pais() {
        return nombre_pais;
    }

    public void setNombre_pais(String nombre_pais) {
        this.nombre_pais = nombre_pais;
    }
}
