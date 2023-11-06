package com.TransformadorMayusMinus.TransformarMayusculasYMinusculas;

import java.util.Scanner;
import java.util.ArrayList;
import com.TransformadorMayusMinus.interfaces.*;
import com.TransformadorMayusMinus.servicios.*;

/**
 * Hello world!
 *
 */
public class App 
{
static Scanner entrada=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// Definicion del metodo con lambda
		
		Transformador aMayusculas=(lista)->{
			ArrayList<String> resultado=new ArrayList<String>();
			for(String palabra : lista)
			{
				resultado.add(palabra.toUpperCase());
			}
			return resultado;
		};
		Transformador aMinusculas=(lista)->{
			ArrayList<String> resultado=new ArrayList<String>();
			for(String palabra : lista)
			{
				resultado.add(palabra.toLowerCase());
			}
			return resultado;
		};	
		
		ControlFlujoConsola.mostrarPalabras(aMayusculas.transformar(ControlFlujoConsola.cargarPalabras()));
		ControlFlujoConsola.mostrarPalabras(aMinusculas.transformar(ControlFlujoConsola.cargarPalabras()));
		
		
		
	}
	

}
