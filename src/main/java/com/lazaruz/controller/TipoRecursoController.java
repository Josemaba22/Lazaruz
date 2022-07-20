package com.lazaruz.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lazaruz.entity.TipoRecurso;
import com.lazaruz.request.TipoRecursoRequest;
import com.lazaruz.response.TipoRecursoResponse;
import com.lazaruz.service.TipoRecursoService;


@RestController
@RequestMapping("api/lazaruz/tipo_recurso")
public class TipoRecursoController {

	@Autowired
	private TipoRecursoService tipoRecursoService;
	
	@PostMapping("/registrar")
	public TipoRecursoResponse registrarTipoRecurso(@Valid @RequestBody TipoRecursoRequest request) {
		TipoRecurso tipoRecurso = tipoRecursoService.registrarTipoRecurso(request);
		return new TipoRecursoResponse(tipoRecurso);
	}
}
