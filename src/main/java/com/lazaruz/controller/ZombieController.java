package com.lazaruz.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lazaruz.entity.Zombie;
import com.lazaruz.request.ZombieRequest;
import com.lazaruz.response.ZombieResponse;
import com.lazaruz.service.ZombieService;

@RestController
@RequestMapping("/api/lazaruz/zombie")
public class ZombieController {

	@Autowired
	private ZombieService zombieService;
	
	@PostMapping("/registrar")
	public ZombieResponse registrarzombie(@Valid @RequestBody ZombieRequest request) {
		Zombie zombie = zombieService.registrarZombie(request);
		return new ZombieResponse(zombie);
	}
}
