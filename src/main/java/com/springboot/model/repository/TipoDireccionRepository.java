package com.springboot.model.repository;

import com.springboot.model.entity.TipoDireccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoDireccionRepository extends JpaRepository<TipoDireccion, Integer> {
}

