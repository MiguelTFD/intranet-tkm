package com.springboot.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tipoDocumento")
public class TipoDocumento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoDoc;

    @Column(name = "nombreTipo", nullable = false, unique = true)
    private String nombreTipo;

    public TipoDocumento() {
    }

    // Getters y setters


    public int getIdTipoDoc() {
        return idTipoDoc;
    }

    public void setIdTipoDoc(int idTipoDoc) {
        this.idTipoDoc = idTipoDoc;
    }

    public String getNombreTipo() {
        return nombreTipo;
    }

    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }
}

