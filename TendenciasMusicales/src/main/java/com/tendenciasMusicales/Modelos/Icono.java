package com.tendenciasMusicales.Modelos;

public class Icono {
	
	

	private int[] internalEncoding;
	
	Icono(int[] internalEncoding){
	this.internalEncoding = internalEncoding;
	}
	public String texto() {
	return new String(internalEncoding, 0, internalEncoding.length);
}
}