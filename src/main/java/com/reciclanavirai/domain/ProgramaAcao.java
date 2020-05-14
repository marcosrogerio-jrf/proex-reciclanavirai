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
	
	//GET E SET

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Bairro getBairro() {
		return bairro;
	}

	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}

	public Gestor getGestor() {
		return gestor;
	}

	public void setGestor(Gestor gestor) {
		this.gestor = gestor;
	}
	
	
	
	
	
	
}
