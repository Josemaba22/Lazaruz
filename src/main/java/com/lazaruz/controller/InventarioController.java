package com.lazaruz.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lazaruz.entity.Inventario;
import com.lazaruz.request.InventarioRequest;
import com.lazaruz.response.InventarioResponse;
import com.lazaruz.service.InventarioService;

@RestController
@RequestMapping("api/lazaruz/inventario")
public class InventarioController {

	@Autowired
	private InventarioService inventarioService;
	
	@PostMapping("/registrar")
	public InventarioResponse registrarMapa(@Valid @RequestBody InventarioRequest request) {
		Inventario inventario = inventarioService.registrarInventario(request);
		return new InventarioResponse(inventario);
	}
}
