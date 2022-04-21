package com.lazaruz.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "zombies")
public class Zona {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_zona")
	private Long id_zona;
	
	@Column(name = "eje_y")
	private int eje_y;

	@Column(name = "eje_x")
	private int eje_x;
	
	@ManyToOne
	@JoinColumn(name = "id_mapa", referencedColumnName = "id_mapa")
	private Mapa mapa;
	
	@OneToMany(mappedBy = "zona", cascade = CascadeType.ALL)
	private List<Zombie> zombies;
	
}
