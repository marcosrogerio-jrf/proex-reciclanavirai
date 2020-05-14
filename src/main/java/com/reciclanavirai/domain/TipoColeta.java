package com.reciclanavirai.domain;

public enum TipoColeta {
	
	COLETACOMUM(1), COLETASELETIVA(2);
	
	private final int coleta;
	
	TipoColeta(int tipoColeta){
		coleta = tipoColeta;
	}
	
	public int getTipoColeta() {
		return coleta;
	}
	
}
