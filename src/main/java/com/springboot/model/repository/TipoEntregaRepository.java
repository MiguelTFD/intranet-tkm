package com.springboot.model.repository;

import com.springboot.model.entity.TipoEntrega;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoEntregaRepository extends JpaRepository<TipoEntrega, Integer> {
}

