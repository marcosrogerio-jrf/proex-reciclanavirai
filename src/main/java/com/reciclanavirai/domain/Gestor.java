package com.reciclanavirai.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity @SuppressWarnings("serial")
public class Gestor extends Usuario{
	
	@Column(nullable = false, length = 80)
	private String cargo;
	
	//GET E SET

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	
}
