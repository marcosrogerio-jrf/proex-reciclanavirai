package com.reciclanavirai.domain;

import javax.persistence.MappedSuperclass;


@MappedSuperclass @SuppressWarnings("serial")
public abstract class Usuario extends AbstractEntity<Long>{

	private String nome;
	private String CPF;
	private String email;
	private String password;
	
	// GET E SET
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
