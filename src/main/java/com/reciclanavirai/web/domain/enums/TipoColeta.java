package com.reciclanavirai.web.domain.enums;

public enum TipoColeta {

	COLETASELETIVA(1, "Coleta Seletiva"), COLETACOMUM(2, "Coleta Comum");

	private int codigo;
	private String descricao;

	private TipoColeta(int codigo, String descricao) {
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

	public static TipoColeta toEnum(Integer codigo) {
		if (codigo == null) {
			return null;
		}
		for (TipoColeta tC : TipoColeta.values()) {
			if (codigo.equals(tC.getCodigo())) {
				return tC;
			}
		}
		throw new IllegalArgumentException("Código Invalido: "+ codigo);
	}

}
