package com.lazaruz.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lazaruz.entity.TipoRecurso;

public interface TipoRecursoRepository extends JpaRepository<TipoRecurso, Long> {

	Optional<TipoRecurso> findById(Long id); 
}
