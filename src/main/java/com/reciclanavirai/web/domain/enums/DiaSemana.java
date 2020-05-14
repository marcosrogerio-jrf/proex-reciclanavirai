package com.reciclanavirai.web.domain.enums;

public enum DiaSemana {

	DOMINGO(1, "Domingo"), 
	SEGUNDA_FEIRA(2, "Segunda-feira"),
	TERCA_FEIRA(3, "Terça-feira"), 
	QUARTA_FEIRA(4, "Quarta-feira"), 
	QUINTA_FEIRA(5, "Quinta-feira"), 
	SEXTA_FEIRA(6, "Sexta-feira"),
	SABADO(7, "Sábado");

	private int codigo;
	private String descricao;

	private DiaSemana(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	// getters

	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public static DiaSemana toEnum(Integer codigo) {
		if (codigo == null) {
			return null;
		}
		for (DiaSemana tC : DiaSemana.values()) {
			if (codigo.equals(tC.getCodigo())) {
				return tC;
			}
		}
		throw new IllegalArgumentException("Código Invalido: "+ codigo);
	}

}
