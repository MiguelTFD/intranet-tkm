package com.springboot.model.repository;

import com.springboot.model.entity.Provincia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProvinciaRepository extends JpaRepository<Provincia, Integer> {
    List<Provincia> findByDepartamento_Id(int id_departamento);
}
