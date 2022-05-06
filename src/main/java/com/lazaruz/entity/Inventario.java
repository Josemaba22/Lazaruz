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

import com.lazaruz.request.InventarioRequest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "iventarios")
public class Inventario {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY) 
	@Column(name = "id")
	private Long id;
	
	@Column(name = "cantidad")
	private int cantidad;
	
	@OneToMany(mappedBy = "inventario", cascade = CascadeType.ALL)
	private List<Player> players;
	
	public Inventario(InventarioRequest request) {
		this.cantidad = request.getCantidad();
	}
	
}
