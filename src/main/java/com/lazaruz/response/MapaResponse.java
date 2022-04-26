package com.lazaruz.response;

import com.lazaruz.entity.Mapa;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MapaResponse {

	private Long id;
	
	private String nombre;
	
	public MapaResponse(Mapa mapa) {
		this.id = mapa.getId();
		this.nombre = mapa.getNombre();
	}
}
