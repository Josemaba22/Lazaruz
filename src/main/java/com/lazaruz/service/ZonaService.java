package com.lazaruz.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lazaruz.entity.Mapa;
import com.lazaruz.entity.Zona;
import com.lazaruz.repository.MapaRepository;
import com.lazaruz.repository.ZonaRepository;
import com.lazaruz.request.ZonaRequest;

@Service
public class ZonaService {

	@Autowired
	ZonaRepository zonaRepository;
	
	@Autowired
	MapaRepository mapaRepository;
	
	public Zona registrarZona(ZonaRequest request) {
		Zona zona = new Zona(request);
		Optional<Mapa> mapa = mapaRepository.findById(request.getId_mapa());
		zona.setMapa(mapa.get());
		return zonaRepository.save(zona);
	}
	
}
