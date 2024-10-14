package com.springboot.model.repository;

import com.springboot.model.entity.DetalleOrden;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalleOrdenRepository extends JpaRepository<DetalleOrden, Integer> {
}

