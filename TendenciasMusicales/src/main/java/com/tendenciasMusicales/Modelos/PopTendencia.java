package com.tendenciasMusicales.Modelos;

import java.util.Calendar;

public class PopTendencia extends Popularidad {

	private static String nombre = "Tendencia";
	private static Icono FIRE = new Icono(new int[]{0xD83D, 0xDD25});
	private String leyenda;
	
	public PopTendencia(Cancion cancionActual)
	{
		this.leyenda=cancionActual.getNombreArtista()+"-"+cancionActual.getNombreCancion()+"("+cancionActual.getNombreAlbum()+"-"+cancionActual.getFechaAlbum().get(Calendar.YEAR)+")";
	}

	public String getIcono() {return FIRE.texto();}
	public String getLeyenda() {return leyenda;}
	public String getNombre() {return nombre;}
	@Override
	public void chequearPopularidad(Cancion cancionActual) {
		Calendar lapsoTiempo=Calendar.getInstance();
		lapsoTiempo.add(Calendar.HOUR, -24);
		if(cancionActual.getFechaUltimaRep().before(lapsoTiempo))
		{
			cancionActual.cambiarPopularidad(new PopNormal(cancionActual));
		}
	}

}
