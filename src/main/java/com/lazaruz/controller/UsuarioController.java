package com.lazaruz.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lazaruz.entity.Usuario;
import com.lazaruz.request.UsuarioRequest;
import com.lazaruz.response.UsuarioResponse;
import com.lazaruz.service.UsuarioService;

@RestController
@RequestMapping("/api/lazaruz/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	@PostMapping("/register")
	public UsuarioResponse registrarUsuario(@Valid @RequestBody UsuarioRequest request) {
		Usuario usuario = usuarioService.registrarUsuario(request);
		return new UsuarioResponse(usuario);
	}
	
	@GetMapping("/saludar")
	public String saludar() {
		return "Hello World desde Spring";
	}
}
