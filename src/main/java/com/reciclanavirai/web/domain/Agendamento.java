package com.reciclanavirai.web.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@SuppressWarnings("serial")
@Getter
@Setter
public class Agendamento extends AbstractEntity<Long> {
	@Column(nullable = false, length = 20)
	private String horario;
	@Column(name = "tipo_coleta", nullable = false)
	private Integer tipoColeta;
	@Column(name = "dia_semana", nullable = false)
	private Integer diaSemana;

	@ManyToOne
	@JoinColumn(name = "bairro_id")
	private Bairro bairro;

}
