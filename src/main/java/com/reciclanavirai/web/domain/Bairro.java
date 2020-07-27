package com.reciclanavirai.web.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("serial")
@Entity
@Getter
@Setter
public class Bairro extends AbstractEntity<Long> {

	@Column(nullable = false, unique = true, length = 80)
	private String nome;

	@OneToMany(mappedBy = "bairro")
	private List<Agendamento> agendamentos = new ArrayList<>();

}
