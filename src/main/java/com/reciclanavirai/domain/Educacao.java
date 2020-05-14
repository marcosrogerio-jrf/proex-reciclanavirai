package com.reciclanavirai.domain;

import java.io.File;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;




@Entity @SuppressWarnings("serial")
public class Educacao extends AbstractEntity<Long>{
	
	@Column(nullable = false, length = 70)
	private String titulo;
	
	@Column(nullable = false, length = 120)
	private String materia;
	
	@Column(nullable = false, length = 700)
	private String autoria;
	
	@Column(nullable = true)
	private File fotos;
	
	@ManyToOne @JoinColumn(name = "id_gestor_fk")
	private Gestor gestor;
	
	
	
}
