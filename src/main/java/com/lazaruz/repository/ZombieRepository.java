package com.lazaruz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lazaruz.entity.Zombie;

@Repository
public interface ZombieRepository extends JpaRepository<Zombie, Long>{

	
}
