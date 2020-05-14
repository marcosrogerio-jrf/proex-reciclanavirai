package com.reciclanavirai.web.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.reciclanavirai.web.domain.enums.TipoColeta;

@Entity
@SuppressWarnings("serial")

public class Agendamento extends AbstractEntity<Long>{
	@Column(nullable = false, length = 20)
	private Date data;
	@Column(name = "tipo_coleta", nullable = false)
	private Integer tipoColeta;
	
	@ManyToOne
	@JoinColumn(name = "bairro_id")
	private Bairro bairro;

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public TipoColeta getTipoColeta() {
		return TipoColeta.toEnum(tipoColeta);
	}

	public void setTipoColeta(TipoColeta tipoColeta) {
		this.tipoColeta = tipoColeta.getCodigo();
	}

	public Bairro getBairro() {
		return bairro;
	}

	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}
	
	
}
