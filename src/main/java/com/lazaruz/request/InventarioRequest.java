package com.lazaruz.request;

import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InventarioRequest {

	@NotBlank(message = "La cantidad es requerido!")
	private int cantidad;
	
}
