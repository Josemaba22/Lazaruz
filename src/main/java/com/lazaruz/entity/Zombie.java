package com.lazaruz.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.lazaruz.request.ZombieRequest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "zombies")
public class Zombie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "salud")
	private int salud;
	
	@Column(name = "ataque")
	private int ataque;
	
	@ManyToOne
	@JoinColumn(name = "id_zona", referencedColumnName = "id")
	private Zona zona;
	
	public Zombie(ZombieRequest request) {
		this.salud = request.getSalud();
		this.ataque = request.getAtaque();
	}
	
}
