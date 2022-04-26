package com.lazaruz.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.lazaruz.request.PlayerRequest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "players")
public class Player {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY) 
	@Column(name = "id")
	private Long id;
	
	@Column(name = "nivel")
	private int nivel;
	
	@Column(name = "experiencia")
	private int experiencia;
	
	@Column(name = "fe")
	private int fe;

	@Column(name = "salud")
	private int salud;

	@Column(name = "fuerza")
	private int fuerza;

	@Column(name = "suerte")
	private int suerte;

	@Column(name = "zombies_abatidos")
	private int zombies_abatidos;

	@ManyToOne
	@JoinColumn(name = "id_mapa", referencedColumnName = "id")
	private Mapa mapa;

	@ManyToOne
	@JoinColumn(name = "id_usuario", referencedColumnName = "id")
	private Usuario usuario;
	
	public Player(PlayerRequest request) {
		this.nivel = request.getNivel();
		this.experiencia = request.getExpericencia();
		this.fe = request.getFe();
		this.salud = request.getSalud();
		this.fuerza = request.getFuerza();
		this.suerte = request.getSuerte();
		this.zombies_abatidos = request.getZombies_abatidos();
	}

}
