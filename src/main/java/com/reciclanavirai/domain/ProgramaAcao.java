package com.reciclanavirai.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;





@Entity @SuppressWarnings("serial")
public class ProgramaAcao extends AbstractEntity<Long>{
	
	@Column(nullable = false, length = 80)
	private String titulo;
	
	@Column(nullable = false, length = 120)
	private String descricao;
	
	@Column(nullable = false)
	private Date data;
	
	@ManyToOne @JoinColumn(name = "id_bairro_fk") //varios programas para um bairro
	private Bairro bairro;
	
	@ManyToOne @JoinColumn(name = "id_gestor_fk")
	private Gestor gestor;
	
	
}
