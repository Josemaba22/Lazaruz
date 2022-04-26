package com.lazaruz.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lazaruz.entity.Mapa;
import com.lazaruz.request.MapaRequest;
import com.lazaruz.response.MapaResponse;
import com.lazaruz.service.MapaService;

@RestController
@RequestMapping("/api/lazaruz/mapa")
public class MapaController {

	@Autowired
	private MapaService mapaService;
	
	@PostMapping("/registrar")
	public MapaResponse registrarMapa(@Valid @RequestBody MapaRequest request) {
		Mapa mapa = mapaService.registrarMapa(request);
		return new MapaResponse(mapa);
	}
}
