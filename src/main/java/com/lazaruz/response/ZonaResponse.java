package com.lazaruz.response;

import com.lazaruz.entity.Zona;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ZonaResponse {

	private Long id;
	private int eje_y;
	private int eje_x;
	private MapaResponse mapa;
	
	public ZonaResponse(Zona zona) {
		this.id = zona.getId();
		this.eje_y = zona.getEje_y();
		this.eje_x = zona.getEje_x();
		this.mapa = new MapaResponse(zona.getMapa());
	}
	
}
