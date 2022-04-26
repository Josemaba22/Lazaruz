package com.lazaruz.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlayerRequest {

	private int nivel;
	private int expericencia;
	private int fe;
	private int salud;
	private int fuerza;
	private int suerte;
	private int zombies_abatidos;
	private Long id_mapa;
	private Long id_usuario;
	
}
