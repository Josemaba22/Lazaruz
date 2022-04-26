package com.lazaruz.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lazaruz.entity.Zona;
import com.lazaruz.request.ZonaRequest;
import com.lazaruz.response.ZonaResponse;
import com.lazaruz.service.ZonaService;

@RestController
@RequestMapping("/api/lazaruz/zona")
public class ZonaController {

	@Autowired
	private ZonaService zonaService;
	
	@PostMapping("/registrar")
	public ZonaResponse registrarZona(@Valid @RequestBody ZonaRequest request) {
		Zona zona = zonaService.registrarZona(request);
		return new ZonaResponse(zona);
	}
}
