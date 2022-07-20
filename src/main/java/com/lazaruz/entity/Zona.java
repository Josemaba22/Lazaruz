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
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.lazaruz.request.ZonaRequest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "zonas")
public class Zona {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "eje_y")
	private int eje_y;

	@Column(name = "eje_x")
	private int eje_x;
	
	@ManyToOne
	@JoinColumn(name = "id_mapa", referencedColumnName = "id")
	private Mapa mapa;
	
	@OneToMany(mappedBy = "zona", cascade = CascadeType.ALL)
	private List<Zombie> zombies;
	
	@OneToMany(mappedBy = "zona", cascade = CascadeType.ALL)
	private List<Player> players;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_inventario", referencedColumnName = "id")
    private Inventario inventario;
	
	
	
	public Zona(ZonaRequest request) {
		this.eje_x = request.getEje_x();
		this.eje_y = request.getEje_y();
	}
	
}
