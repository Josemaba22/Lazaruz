package com.lazaruz.response;

import com.lazaruz.entity.Usuario;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioResponse {
	
	private Long id;
	
	private String nombre;

	private String email;

	private String password;

	private int puntos_de_alma;
	
	public UsuarioResponse(Usuario usuario) {
		this.id = usuario.getId();
		this.nombre = usuario.getNombre();
		this.email = usuario.getEmail();
		this.password = usuario.getPassword();
		this.puntos_de_alma = usuario.getPuntos_de_alma();
	}
}
