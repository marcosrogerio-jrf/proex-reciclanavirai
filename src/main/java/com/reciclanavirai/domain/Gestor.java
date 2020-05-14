package com.reciclanavirai.domain;

import javax.persistence.Entity;

@Entity @SuppressWarnings("serial")
public class Gestor extends Usuario{
	
	private String cargo;
	
	//GET E SET

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	
}
