package com.lazaruz.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lazaruz.entity.Mapa;

@Repository
public interface MapaRepository extends JpaRepository<Mapa, Long>{

	Mapa findByNombre(String nombre);
	
	Optional<Mapa> findById(Long id);
	
}
