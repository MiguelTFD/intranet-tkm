package com.springboot.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tipo_direccion")
public class TipoDireccion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id_tipo_direccion;
	 @Column(name = "nombre_tipo", nullable = false)
	    private String nombre_tipo;
	public int getId_tipo_direccion() {
		return id_tipo_direccion;
	}
	public void setId_tipo_direccion(int id_tipo_direccion) {
		this.id_tipo_direccion = id_tipo_direccion;
	}
	public String getNombre_tipo() {
		return nombre_tipo;
	}
	public void setNombre_tipo(String nombre_tipo) {
		this.nombre_tipo = nombre_tipo;
	}

}
