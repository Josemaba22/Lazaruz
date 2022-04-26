package com.lazaruz.request;

import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MapaRequest {

	@NotBlank(message = "El nombre es requerido!")
	private String nombre;
	
}
