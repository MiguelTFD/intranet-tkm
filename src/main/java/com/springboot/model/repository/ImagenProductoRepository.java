package com.springboot.model.repository;

import com.springboot.model.entity.ImagenProducto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImagenProductoRepository extends JpaRepository<ImagenProducto, Integer> {
}
