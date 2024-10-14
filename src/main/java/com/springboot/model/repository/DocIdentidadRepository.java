package com.springboot.model.repository;

import com.springboot.model.entity.DocIdentidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocIdentidadRepository extends JpaRepository<DocIdentidad, Integer> {
}
