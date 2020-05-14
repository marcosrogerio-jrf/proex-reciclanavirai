package com.reciclanavirai.domain;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



@Entity @SuppressWarnings("serial")
public class Agendamento extends AbstractEntity<Long> {

	@Column(nullable = false)
	private Date dataHora;
	
	@Column(nullable = false, length = 80)
	private TipoColeta tipoColeta;
	
	@ManyToOne @JoinColumn(name = "id_bairro_fk") // varios agendamentos para um bairro
	private Bairro bairro;

	//GET E SET	
	
	public TipoColeta getTipoColeta() {
		return tipoColeta;
	}

	public void setTipoColeta(TipoColeta tipoColeta) {
		this.tipoColeta = tipoColeta;
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
