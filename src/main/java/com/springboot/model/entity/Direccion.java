package com.springboot.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "direccion")
public class Direccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDireccion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idPais", nullable = false)
    private Pais pais;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idDepartamento", nullable = false)
    private Departamento departamento;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idProvincia", nullable = false)
    private Provincia provincia;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idDistrito", nullable = false)
    private Distrito distrito;

    @Column(name = "direccionExacta", nullable = false, length = 255)
    private String direccionExacta;

    @Column(name = "referencia", length = 255)
    private String referencia;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idTipoDireccion", nullable = false)
    private TipoDireccion tipoDireccion;


    public Direccion() {
    }

    // Getters y setters


    public Integer getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(Integer idDireccion) {
        this.idDireccion = idDireccion;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public Distrito getDistrito() {
        return distrito;
    }

    public void setDistrito(Distrito distrito) {
        this.distrito = distrito;
    }

    public String getDireccionExacta() {
        return direccionExacta;
    }

    public void setDireccionExacta(String direccionExacta) {
        this.direccionExacta = direccionExacta;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public TipoDireccion getTipoDireccion() {
        return tipoDireccion;
    }

    public void setTipoDireccion(TipoDireccion tipoDireccion) {
        this.tipoDireccion = tipoDireccion;
    }
}

