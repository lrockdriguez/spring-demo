package com.baz.demo.model;

import lombok.Getter;
import lombok.Setter;

public class Usuario {

	public Usuario(String nombre, String apellido, String email) {

		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
	}

	public Usuario() {

	}

	@Getter
	@Setter
	private String nombre;

	@Getter
	@Setter
	private String apellido;

	@Getter
	@Setter
	private String email;

}
