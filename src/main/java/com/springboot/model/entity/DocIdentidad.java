package com.springboot.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "docIdentidad")
public class DocIdentidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDoc;

    @Column(name = "numDoc", nullable = false, unique = true)
    private String numDoc;

    @ManyToOne
    @JoinColumn(name = "idTipoDoc", nullable = false)
    private TipoDocumento tipoDocumento;

    @ManyToOne
    @JoinColumn(name = "idUsuario", nullable = false)
    private Usuario usuario;

    public DocIdentidad() {
    }

    // Getters y setters


    public int getIdDoc() {
        return idDoc;
    }

    public void setIdDoc(int idDoc) {
        this.idDoc = idDoc;
    }

    public String getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(String numDoc) {
        this.numDoc = numDoc;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
