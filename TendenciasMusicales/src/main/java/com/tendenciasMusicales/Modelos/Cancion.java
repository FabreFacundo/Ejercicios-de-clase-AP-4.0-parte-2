package com.tendenciasMusicales.Modelos;

import java.util.Calendar;




public class Cancion {

	private int cantidadLikes;
	private int cantidadDislikes;
	private int cantidadRep;
	private String nombreArtista;
	private String nombreCancion;
	private String nombreAlbum;
	private Calendar fechaAlbum= Calendar.getInstance();
	private Calendar fechaUltimaRep= Calendar.getInstance();
	private Popularidad popActual;
	
	
	
	
	public Cancion(String nombreArtista, String nombreCancion, String nombreAlbum,int dia,int mes, int año) {
		super();
		this.nombreArtista = nombreArtista;
		this.nombreCancion = nombreCancion;
		this.nombreAlbum = nombreAlbum;
		this.popActual=new PopNormal(this);
		this.fechaAlbum.set(año,mes-1,dia);
	}


	public int getCantidadLikes() {
		return cantidadLikes;
	}


	public void darLikes(int cantidadLikes) {
		this.cantidadLikes += cantidadLikes;
	}


	public int getCantidadDislikes() {
		return cantidadDislikes;
	}


	public void darDislikes(int cantidadDislikes) {
		this.cantidadDislikes += cantidadDislikes;
	}


	public int getCantidadRep() {
		return cantidadRep;
	}


	public void setCantidadRep(int cantidadRep) {
		this.cantidadRep += cantidadRep;
	}


	public String getNombreArtista() {
		return nombreArtista;
	}


	public String getNombreCancion() {
		return nombreCancion;
	}


	public String getNombreAlbum() {
		return nombreAlbum;
	}

	public Calendar getFechaAlbum()
	{
		return fechaAlbum;
	}
	public String getFechaAlbumString() {
		return fechaAlbum.get(Calendar.DAY_OF_MONTH)+"/"+(fechaAlbum.get(Calendar.MONTH)+1)+"/"+fechaAlbum.get(Calendar.YEAR);
	}


	public Calendar getFechaUltimaRep() {
		return fechaUltimaRep;
	}

	public void setFechaUltimaRep(int dia, int mes,int año,int horas,int minutos) {
		this.fechaUltimaRep.set(año,mes-1,dia,horas,minutos);
	}

	public void cambiarPopularidad(Popularidad nuevaPopularidad)
	{
		this.popActual=nuevaPopularidad;
	}
	
	public void chequearPopularidad()
	{
		this.popActual.chequearPopularidad(this);
		System.out.println("La popularidad de esta cancion actualmente es: "+popActual.getNombre());
		System.out.println("Cantidad de reproducciones	Likes	 Dislikes\n"+cantidadRep+"\t"+cantidadLikes+"\t"+cantidadDislikes);
	}
	
	public void reproducir()
	{
		System.out.println("Sonando...\n");
		System.out.println(popActual.getIcono()+popActual.getLeyenda()+popActual.getIcono());
		cantidadRep++;
		fechaUltimaRep=Calendar.getInstance();
	}
}
