package com.springboot.model.repository;

import com.springboot.model.entity.Distrito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DistritoRepository extends JpaRepository<Distrito, Integer> {
    List<Distrito> findByProvincia_Id(int id_provincia);
}
