package com.reciclanavirai.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity @SuppressWarnings("serial")
public class Gestor extends Usuario{
	
	@Column(nullable = false, length = 80)
	private String cargo;
	
	@OneToMany(mappedBy = "gestor")
	private List<ProgramaAcao> programasAcoes;
	
	//GET E SET
	
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public List<ProgramaAcao> getProgramasAcoes() {
		return programasAcoes;
	}

	public void setProgramasAcoes(List<ProgramaAcao> programasAcoes) {
		this.programasAcoes = programasAcoes;
	}	
	
}
