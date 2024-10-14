package com.springboot.model.entity;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "ordenCompra")
public class OrdenCompra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idOrden;

    @ManyToOne
    @JoinColumn(name = "idCliente", nullable = false)
    private Usuario cliente;

    @Column(name = "fechaOrden", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaOrden;

    @ManyToOne
    @JoinColumn(name = "idTipoEntrega", nullable = false)
    private TipoEntrega tipoEntrega;

    @ManyToOne
    @JoinColumn(name = "idEstado", nullable = false)
    private EstadoOrden estadoOrden;

    @Column(name = "informacionDelPedido")
    private String informacionDelPedido;

    @Column(name = "instruccionEntrega")
    private String instruccionEntrega;

    @ManyToOne
    @JoinColumn(name = "direccionEntrega", nullable = false)
    private Direccion direccionEntrega;

    // Relación con DetalleOrden
    @OneToMany(mappedBy = "orden", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DetalleOrden> detalles;

    public OrdenCompra() {
    }

    // Getters y setters


    public int getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }

    public Usuario getCliente() {
        return cliente;
    }

    public void setCliente(Usuario cliente) {
        this.cliente = cliente;
    }

    public Date getFechaOrden() {
        return fechaOrden;
    }

    public void setFechaOrden(Date fechaOrden) {
        this.fechaOrden = fechaOrden;
    }

    public TipoEntrega getTipoEntrega() {
        return tipoEntrega;
    }

    public void setTipoEntrega(TipoEntrega tipoEntrega) {
        this.tipoEntrega = tipoEntrega;
    }

    public EstadoOrden getEstadoOrden() {
        return estadoOrden;
    }

    public void setEstadoOrden(EstadoOrden estadoOrden) {
        this.estadoOrden = estadoOrden;
    }

    public String getInformacionDelPedido() {
        return informacionDelPedido;
    }

    public void setInformacionDelPedido(String informacionDelPedido) {
        this.informacionDelPedido = informacionDelPedido;
    }

    public String getInstruccionEntrega() {
        return instruccionEntrega;
    }

    public void setInstruccionEntrega(String instruccionEntrega) {
        this.instruccionEntrega = instruccionEntrega;
    }

    public Direccion getDireccionEntrega() {
        return direccionEntrega;
    }

    public void setDireccionEntrega(Direccion direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }

    public List<DetalleOrden> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetalleOrden> detalles) {
        this.detalles = detalles;
    }
}

