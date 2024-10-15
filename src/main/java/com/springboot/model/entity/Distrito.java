package com.springboot.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;


@Entity
@Table(name = "distrito")
public class Distrito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_distrito")
    private int id;

    @Column(name = "nombre_distrito")
    private String nombre_distrito;

    //------------
    // RelationShip(distrito *-----1 provincia)
    @ManyToOne
    @JoinColumn(name = "id_provincia")
    @JsonIgnore
    private Provincia provincia;

    /* Aqui falta implementar el distrito 1-----* direccion*/

    public Distrito() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_distrito() {
        return nombre_distrito;
    }

    public void setNombre_distrito(String nombre_distrito) {
        this.nombre_distrito = nombre_distrito;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }
}
