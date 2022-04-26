package com.lazaruz.request;

import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioRequest {

	@NotBlank(message = "El nombre es requerido!")
	private String nombre;
	
	@NotBlank(message = "El email es requerido!")
	private String email;
	
	@NotBlank(message = "password es requerido!")
	private String password;
	
	//@NotNull(message = "puntos de alma es requerido!")
	private int puntos_de_alma;
}
