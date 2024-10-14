package com.springboot.model.entity;

import java.io.Serializable;
import java.util.Objects;

public class DetalleOrdenId implements Serializable {

    private int orden;
    private int producto;

    public DetalleOrdenId() {
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    public int getProducto() {
        return producto;
    }

    public void setProducto(int producto) {
        this.producto = producto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DetalleOrdenId)) return false;
        DetalleOrdenId that = (DetalleOrdenId) o;
        return orden == that.orden && producto == that.producto;
    }

    @Override
    public int hashCode() {
        return Objects.hash(orden, producto);
    }
}

