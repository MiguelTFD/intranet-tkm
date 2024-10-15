package com.springboot.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.model.entity.EstadoOrden;

public interface EstadoOrdenRepository extends JpaRepository<EstadoOrden, Integer> {

}
