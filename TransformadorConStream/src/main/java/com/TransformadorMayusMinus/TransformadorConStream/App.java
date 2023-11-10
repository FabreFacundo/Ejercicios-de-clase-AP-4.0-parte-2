package com.TransformadorMayusMinus.TransformadorConStream;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       List<String> miLista=Arrays.asList("Hola","Como","Esta","el","Clima","en","Mexico?");
       System.out.println("Lista a transformar:");
       System.out.println(miLista+"\n");
       System.out.println("Primero en mayusculas: ");
       System.out.println(convertirAMayusculas(miLista));
       System.out.println("\nSeparada por comas las palabras mayores a 4 letras: ");
       System.out.println(separarConComa(miLista, 4));
    }
    
    public static List<String> convertirAMayusculas(List<String> listaAConvertir)
    {
    	return listaAConvertir.stream().map((frase)->frase.toUpperCase()).collect(Collectors.toList());
    }
    public static String separarConComa(List<String> listaASeparar, int tamañoMaximo)
    {
    	return listaASeparar.stream().filter(palabra->palabra.length()>tamañoMaximo).collect(Collectors.joining(", "));
    }
}
