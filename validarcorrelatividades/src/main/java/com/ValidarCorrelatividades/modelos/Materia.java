package com.ValidarCorrelatividades.modelos;

import java.util.ArrayList;

public class Materia {

	private String nombreMateria;
	private ArrayList<Materia> m_correlativas;
	
	public Materia(String str_nombre)
	{
		this.nombreMateria=str_nombre;
		this.m_correlativas= new ArrayList<Materia>();
	}
	
	
	// Getters
	public String getNombre() {return nombreMateria;}
	
	public String getCorrelativasAsString()
	{
		String mensaje="";
		if(m_correlativas.isEmpty()) return "Esta materia no posee correlativas";
		else
		{
			for(Materia m : m_correlativas)
			{
				mensaje+=m.getNombre();
			}
			return mensaje;
		}
	}
	public ArrayList<Materia> getCorrelativas(){return m_correlativas;}
	
	// metodos
	public void agregarCorrelativa(Materia m_correlativa)
	{
		this.m_correlativas.add(m_correlativa);
	}
	public void quitarCorrelativa(Materia m_correlativa)
	{
		this.m_correlativas.remove(m_correlativa);
	}
}
