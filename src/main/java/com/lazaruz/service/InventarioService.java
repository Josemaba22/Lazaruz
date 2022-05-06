package com.lazaruz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lazaruz.entity.Inventario;
import com.lazaruz.repository.InventarioRepository;
import com.lazaruz.request.InventarioRequest;

@Service
public class InventarioService {

	@Autowired
	InventarioRepository inventarioRepository;
	
	public Inventario registrarInventario(InventarioRequest request) {
		Inventario inventario = new Inventario(request);
		return inventarioRepository.save(inventario);
	}
	
}
