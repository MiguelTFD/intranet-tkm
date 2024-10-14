package com.springboot.model.repository;

import com.springboot.model.entity.EstadoOrden;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoOrdenRepository extends JpaRepository<EstadoOrden, Integer> {
}
