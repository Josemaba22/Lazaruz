package com.lazaruz.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lazaruz.entity.Zona;

@Repository
public interface ZonaRepository extends JpaRepository<Zona, Long>{
	
	Optional<Zona> findById(Long id);
	
}
