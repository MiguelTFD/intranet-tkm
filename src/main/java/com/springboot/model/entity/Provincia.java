package com.springboot.model.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "provincia")
public class Provincia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProvincia;

    @Column(name = "nombreProvincia", nullable = false)
    private String nombreProvincia;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idDepartamento", nullable = false)
    private Departamento departamento;

    @OneToMany(mappedBy = "provincia", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Distrito> distritos;

    public Provincia() {
    }
//---------


    public int getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(int idProvincia) {
        this.idProvincia = idProvincia;
    }

    public String getNombreProvincia() {
        return nombreProvincia;
    }

    public void setNombreProvincia(String nombreProvincia) {
        this.nombreProvincia = nombreProvincia;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Set<Distrito> getDistritos() {
        return distritos;
    }

    public void setDistritos(Set<Distrito> distritos) {
        this.distritos = distritos;
    }
}
