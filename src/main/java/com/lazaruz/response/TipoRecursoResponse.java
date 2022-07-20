package com.lazaruz.response;

import com.lazaruz.entity.TipoRecurso;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TipoRecursoResponse {

	private Long id;
	private String nombre;
	private String descripcion;
	
	public TipoRecursoResponse(TipoRecurso tipoRecurso) {
		this.id = tipoRecurso.getId();
		this.nombre = tipoRecurso.getNombre();
		this.descripcion = tipoRecurso.getDescripcion();
	}
}
