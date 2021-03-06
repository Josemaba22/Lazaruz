package com.lazaruz.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lazaruz.entity.Mapa;
import com.lazaruz.entity.Player;
import com.lazaruz.entity.Usuario;
import com.lazaruz.entity.Zona;
import com.lazaruz.repository.MapaRepository;
import com.lazaruz.repository.PlayerRepository;
import com.lazaruz.repository.UsuarioRepository;
import com.lazaruz.repository.ZonaRepository;
import com.lazaruz.request.PlayerRequest;

@Service
public class PlayerService {

	@Autowired
	PlayerRepository playerRepository;
	
	@Autowired
	ZonaRepository zonaRepository;
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	public Player registrarPlayer(PlayerRequest request) {
		Player player = new Player(request);
		Optional<Zona> zona = zonaRepository.findById(request.getId_mapa());
		Optional<Usuario> usuario = usuarioRepository.findById(request.getId_usuario());
		player.setZona(zona.get());
		player.setUsuario(usuario.get());
		return playerRepository.save(player);
	}

}
