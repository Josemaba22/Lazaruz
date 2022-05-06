package com.lazaruz.response;

import com.lazaruz.entity.Inventario;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class InventarioResponse {

	private Long id;
	private int cantidad;
	
	public InventarioResponse(Inventario inventario) {
		this.id = inventario.getId();
		this.cantidad = inventario.getCantidad();
	}
	
}
