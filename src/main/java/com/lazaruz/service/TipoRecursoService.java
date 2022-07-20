package com.lazaruz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lazaruz.entity.TipoRecurso;
import com.lazaruz.repository.TipoRecursoRepository;
import com.lazaruz.request.TipoRecursoRequest;

@Service
public class TipoRecursoService {

	@Autowired
	TipoRecursoRepository tipoRecursoRepository;
	
	public TipoRecurso registrarTipoRecurso(TipoRecursoRequest request) {
		TipoRecurso tipoRecurso = new TipoRecurso(request);
		return tipoRecursoRepository.save(tipoRecurso);
	}

}
