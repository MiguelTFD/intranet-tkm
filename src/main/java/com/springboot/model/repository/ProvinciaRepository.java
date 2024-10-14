package com.springboot.model.repository;

import com.springboot.model.entity.Provincia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvinciaRepository extends JpaRepository<Provincia, Integer> {
}

