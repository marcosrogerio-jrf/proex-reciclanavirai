package com.reciclanavirai.domain;

import java.io.File;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity @SuppressWarnings("serial")
public class Denuncia extends AbstractEntity<Long>{

	@Column(nullable = false, unique = true, length = 80)
	private String descricao;
	
	@Column(nullable = false)
	private File foto;
	
	@Column(nullable = false)
	private Date dataHora;
	
	@ManyToOne @JoinColumn(name = "id_bairro_fk") // muitas denuncias para um bairro
	private Bairro bairro;
	
	//GET E SET

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public File getFoto() {
		return foto;
	}

	public void setFoto(File foto) {
		this.foto = foto;
	}

	public Date getDataHora() {
		return dataHora;
	}

	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}

	public Bairro getBairro() {
		return bairro;
	}

	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}
	
	
	
}
