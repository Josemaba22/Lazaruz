package com.lazaruz.response;

import com.lazaruz.entity.Player;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PlayerResponse {

	private Long id;
	private int nivel;
	private int expericencia;
	private int fe;
	private int salud;
	private int fuerza;
	private int suerte;
	private int zombies_abatidos;
	private MapaResponse mapa;
	private UsuarioResponse usuario;
	
	public PlayerResponse(Player player) {
		this.id = player.getId();
		this.nivel = player.getExperiencia();
		this.expericencia = player.getExperiencia();
		this.fe = player.getFe();
		this.salud = player.getSalud();
		this.fuerza = player.getFuerza();
		this.suerte = player.getSuerte();
		this.zombies_abatidos = player.getZombies_abatidos();
		this.mapa = new MapaResponse(player.getMapa());
		this.usuario = new UsuarioResponse(player.getUsuario());
	}
	
}
