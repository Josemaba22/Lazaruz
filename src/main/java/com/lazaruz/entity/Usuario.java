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

import com.lazaruz.request.UsuarioRequest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "usuarios")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "puntos_de_alma")
	private int puntos_de_alma;
	
	@OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
	private List<Player> players;
	
	public Usuario(UsuarioRequest usuarioRequest) {
		this.nombre = usuarioRequest.getNombre();
		this.email = usuarioRequest.getEmail();
		this.password = usuarioRequest.getPassword();
		this.puntos_de_alma = usuarioRequest.getPuntos_de_alma();
	}

}
