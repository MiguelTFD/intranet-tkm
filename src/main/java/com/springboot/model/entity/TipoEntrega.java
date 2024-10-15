package com.springboot.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "tipo_entrega")
public class TipoEntrega {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id_tipo_entrega;
	 @Column(name = "nombre_tipo", nullable = false)
	    private String nombre_tipo;
	public int getId_tipo_entrega() {
		return id_tipo_entrega;
	}
	public void setId_tipo_entrega(int id_tipo_entrega) {
		this.id_tipo_entrega = id_tipo_entrega;
	}
	public String getNombre_tipo() {
		return nombre_tipo;
	}
	public void setNombre_tipo(String nombre_tipo) {
		this.nombre_tipo = nombre_tipo;
	}
	 


	 
}
