package com.springboot.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "rol")
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_rol;

    @Column(name = "nombre_rol")
    private String nombre_rol;

    //-------------------

    public Rol() {
    }

    //--------------------


    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }

    public String getNombre_rol() {
        return nombre_rol;
    }

    public void setNombre_rol(String nombre_rol) {
        this.nombre_rol = nombre_rol;
    }
}
