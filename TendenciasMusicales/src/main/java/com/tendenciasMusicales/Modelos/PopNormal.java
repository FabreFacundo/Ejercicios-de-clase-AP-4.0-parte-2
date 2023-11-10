package com.tendenciasMusicales.Modelos;

public class PopNormal extends Popularidad{

    private static String nombre = "Normal";
	private static Icono MUSICAL_NOTE = new Icono(new int[]{0xD83C, 0xDFB5});
	private String leyenda;
	
	public String getIcono() {return MUSICAL_NOTE.texto();}
	public String getLeyenda() {return leyenda;}
	public String getNombre() {return nombre;}
	 public PopNormal(Cancion cancionActual)
	 {
		 this.leyenda=cancionActual.getNombreArtista()+"-"+cancionActual.getNombreAlbum()+"-"+cancionActual.getNombreCancion();
	 }
		
	@Override
	public void chequearPopularidad(Cancion cancionActual) {
		
		if(cancionActual.getCantidadRep()>1000 && cancionActual.getCantidadRep()>50000 && cancionActual.getCantidadLikes()>20000)
		{
			cancionActual.cambiarPopularidad(new PopTendencia(cancionActual));
		}
		else if(cancionActual.getCantidadRep()>1000)
		{
			cancionActual.cambiarPopularidad(new PopAuge(cancionActual));
		}
	}


}
