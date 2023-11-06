package com.TransformadorMayusMinus.servicios;

import java.util.Scanner;
import static java.lang.System.out;



import java.util.ArrayList;

public class ControlFlujoConsola {
	
	private static Scanner entrada=new Scanner(System.in);
	
	public static ArrayList<String> cargarPalabras()
	{
		ArrayList<String> aConvertir=new ArrayList<String>();
		out.println("Ingrese palabras separadas con ',' .");
		String[] palabras=entrada.next().split(",");
		for(int i=0;i<palabras.length;i++)
		{
			aConvertir.add(palabras[i]);
		}
		return aConvertir;
	}
	
	public static void mostrarPalabras(ArrayList<String> palabras)
	{
		for(String palabra : palabras) {
			out.println("\n"+palabra);
		}
	}
	
}

