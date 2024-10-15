package com.springboot.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "provincia")
public class Provincia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_provincia")
    private int id;

    @Column(name = "nombre_provincia")
    private String nombre_provincia;

    //-------Relationships-

    //===provincia * ----- 1 departamento
    @ManyToOne
    @JoinColumn(name = "id_departamento")
    @JsonIgnore
    private Departamento departamento;

    //===provincia 1 ----- * distrito
    @OneToMany(mappedBy = "provincia")
    List<Distrito> distritos;

    //=============================

    //Constructor , getters and setters

    public Provincia() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_provincia() {
        return nombre_provincia;
    }

    public void setNombre_provincia(String nombre_provincia) {
        this.nombre_provincia = nombre_provincia;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<Distrito> getDistritos() {
        return distritos;
    }

    public void setDistritos(List<Distrito> distritos) {
        this.distritos = distritos;
    }
}
