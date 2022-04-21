package com.lazaruz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lazaruz.entity.Usuario;
import com.lazaruz.repository.UsuarioRepository;
import com.lazaruz.request.UsuarioRequest;

@Service
public class UsuarioService {

	@Autowired
	UsuarioRepository usuarioRepository;
	
	public Usuario registrarUsuario(UsuarioRequest request) {
		Usuario usuario = new Usuario(request);
		return usuarioRepository.save(usuario);
	}
	
}
