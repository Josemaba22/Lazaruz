package com.lazaruz.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lazaruz.entity.Zombie;
import com.lazaruz.entity.Zona;
import com.lazaruz.repository.ZombieRepository;
import com.lazaruz.repository.ZonaRepository;
import com.lazaruz.request.ZombieRequest;

@Service
public class ZombieService {

	@Autowired
	ZombieRepository zombieRepository;
	
	@Autowired
	ZonaRepository zonaRepository;
	
	public Zombie registrarZombie(ZombieRequest request) {
		Zombie zombie = new Zombie(request);
		Optional<Zona> zona = zonaRepository.findById(request.getId_zona());
		zombie.setZona(zona.get());
		return zombieRepository.save(zombie);
	}
}
