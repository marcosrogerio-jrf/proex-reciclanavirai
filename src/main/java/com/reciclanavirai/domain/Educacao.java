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

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public String getAutoria() {
		return autoria;
	}

	public void setAutoria(String autoria) {
		this.autoria = autoria;
	}

	public File getFotos() {
		return fotos;
	}

	public void setFotos(File fotos) {
		this.fotos = fotos;
	}

	public Gestor getGestor() {
		return gestor;
	}

	public void setGestor(Gestor gestor) {
		this.gestor = gestor;
	}
	
	
	
	
	
}
