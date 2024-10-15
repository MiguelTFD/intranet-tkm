package com.springboot.model.repository;

import com.springboot.model.entity.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartamentoRepository extends JpaRepository<Departamento, Integer> {
    List<Departamento> findByPais_Id(int id_pais);
}
