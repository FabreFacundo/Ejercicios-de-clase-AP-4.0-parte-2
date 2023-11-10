package com.tendenciasMusicales.TendenciasMusicales;

import com.tendenciasMusicales.Modelos.Cancion;

public class App 
{
    public static void main( String[] args )
    {
    	Cancion miCancion=new Cancion("Guns n' Roses","Welcome to the jungle","Appetite for destruction",21,7,1987);
    	miCancion.reproducir();
    	miCancion.chequearPopularidad();
    	miCancion.setCantidadRep(1500);
       	miCancion.chequearPopularidad();
     	miCancion.reproducir();
       	miCancion.darDislikes(10000);
       	miCancion.chequearPopularidad();
     	miCancion.reproducir();
       	miCancion.setCantidadRep(55500);
    	miCancion.darLikes(25000);
    	miCancion.chequearPopularidad();
     	miCancion.reproducir();
    	miCancion.setFechaUltimaRep(9, 11, 2023, 10, 00); //Modificar fecha correspondiente al dia de hacer la prueba
    	miCancion.chequearPopularidad();
     	miCancion.reproducir();
    	
 
    
    }
    
}
