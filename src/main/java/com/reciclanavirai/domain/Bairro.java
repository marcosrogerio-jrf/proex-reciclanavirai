package com.reciclanavirai.domain;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity @SuppressWarnings("serial")
public class Bairro extends AbstractEntity<Long> {

	@Column(nullable = false, unique = true, length = 80)
	private String nome;
	
	@OneToMany(mappedBy = "bairro") // um bairro tem n moradores(municipes)
	private List<Municipe> municipe;
	
	@OneToMany(mappedBy = "bairro") // um bairro com varias denuncias
	private List<Denuncia> denuncias;
	
	@OneToMany(mappedBy = "bairro") // um bairro para varios agendamentos
	private List<Agendamento> agendamentos;
	
	@OneToMany(mappedBy = "bairro") // um bairro pode ter varias ações ao mesmo tempo
	private List<ProgramaAcao> programasAcoes;

	//GET E SET
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Municipe> getMunicipe() {
		return municipe;
	}

	public void setMunicipe(List<Municipe> municipe) {
		this.municipe = municipe;
	}

	public List<Denuncia> getDenuncias() {
		return denuncias;
	}

	public void setDenuncias(List<Denuncia> denuncias) {
		this.denuncias = denuncias;
	}

	public List<Agendamento> getAgendamentos() {
		return agendamentos;
	}

	public void setAgendamentos(List<Agendamento> agendamentos) {
		this.agendamentos = agendamentos;
	}

	public List<ProgramaAcao> getProgramasAcoes() {
		return programasAcoes;
	}

	public void setProgramasAcoes(List<ProgramaAcao> programasAcoes) {
		this.programasAcoes = programasAcoes;
	}
	
	
	
}
