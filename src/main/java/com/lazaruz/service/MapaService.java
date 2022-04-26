package com.lazaruz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lazaruz.entity.Mapa;
import com.lazaruz.repository.MapaRepository;
import com.lazaruz.request.MapaRequest;

@Service
public class MapaService {

	@Autowired
	MapaRepository mapaRepository;
	
	public Mapa registrarMapa(MapaRequest request) {
		Mapa mapa = new Mapa(request);
		return mapaRepository.save(mapa);
	}
}
