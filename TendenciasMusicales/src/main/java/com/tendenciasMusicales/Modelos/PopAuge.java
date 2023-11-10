package com.tendenciasMusicales.Modelos;

import java.util.Calendar;

public class PopAuge extends Popularidad {

	protected static String nombre = "Auge";
	protected static Icono ROCKET = new Icono(new int[]{0xD83D, 0xDE80});
	protected String leyenda;
	
	public PopAuge(Cancion cancionActual)
	{
		this.leyenda=cancionActual.getNombreArtista()+"-"+cancionActual.getNombreCancion()+"("+cancionActual.getNombreAlbum()+"-"+cancionActual.getFechaAlbum().get(Calendar.YEAR)+")";
	}

	public String getIcono() {return ROCKET.texto();}
	public String getLeyenda() {return leyenda;}
	public String getNombre() {return nombre;}
	
	@Override
	public void chequearPopularidad(Cancion cancionActual) {
		if(cancionActual.getCantidadDislikes()>5000)
		{
			cancionActual.cambiarPopularidad(new PopNormal(cancionActual));	
		}
		else if(cancionActual.getCantidadRep()>50000 && cancionActual.getCantidadLikes()>20000)
		{
			cancionActual.cambiarPopularidad(new PopTendencia(cancionActual));
		}
	}

}
