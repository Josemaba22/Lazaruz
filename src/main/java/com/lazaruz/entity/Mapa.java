package com.lazaruz.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "mapas")
public class Mapa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_mapa")
	private Long id_mapa;
	
	@Column(name = "nombre")
	private int nombre;
	
	@OneToMany(mappedBy = "mapa", cascade = CascadeType.ALL)
	private List<Zona> zonas;
	
	@OneToMany(mappedBy = "mapa", cascade = CascadeType.ALL)
	private List<Player> players;
}
