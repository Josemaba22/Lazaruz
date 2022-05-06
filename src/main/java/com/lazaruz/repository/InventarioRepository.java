package com.lazaruz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lazaruz.entity.Inventario;

@Repository
public interface InventarioRepository extends JpaRepository<Inventario, Long>{

}
