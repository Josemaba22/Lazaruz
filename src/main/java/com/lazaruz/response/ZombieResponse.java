package com.lazaruz.response;

import com.lazaruz.entity.Zombie;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ZombieResponse {

	private Long id;
	
	private int salud;
	
	private int ataque;
	
	private ZonaResponse zona;
	
	public ZombieResponse(Zombie zombie) {
		this.id = zombie.getId();
		this.salud = zombie.getSalud();
		this.ataque = zombie.getAtaque();
		this.zona = new ZonaResponse(zombie.getZona());
	}
}
