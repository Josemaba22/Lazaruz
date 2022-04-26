package com.lazaruz.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lazaruz.entity.Player;
import com.lazaruz.request.PlayerRequest;
import com.lazaruz.response.PlayerResponse;
import com.lazaruz.service.PlayerService;

@RestController
@RequestMapping("/api/lazaruz/player")
public class PlayerController {
	
	@Autowired
	private PlayerService playerService;
	
	@PostMapping("/registrar")
	public PlayerResponse registrarPlayer(@Valid @RequestBody PlayerRequest request) {
		Player player = playerService.registrarPlayer(request);
		return new PlayerResponse(player);
	}

}
