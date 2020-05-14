package com.reciclanavirai.domain;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity @SuppressWarnings("serial")
public class Municipe extends Usuario{
	
	@ManyToOne @JoinColumn(name ="id_bairro_fk")
	private Bairro bairro;

	//GET E SET
	
	public Bairro getBairro() {
		return bairro;
	}

	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}
	
	
	
}
