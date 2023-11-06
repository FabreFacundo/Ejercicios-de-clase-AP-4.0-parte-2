package com.ValidarCorrelatividades.modelos;

import java.util.ArrayList;

public class Alumno {
		private String nombre;
		private String apellido;
		private int edad;
		private int comision;
		private ArrayList<Materia> MateriasAprobadas;
		
		// Constructor
		public Alumno(String str_nombre,String str_apellido,int int_edad,int int_comision)
		{
			this.nombre=str_nombre;
			this.apellido=str_apellido;
			this.edad=int_edad;
			this.comision=int_comision;
			this.MateriasAprobadas=new ArrayList<Materia>();
		}
		
		// Setter
		public void setComision(int int_comision) {comision=int_comision;}
		
		// Getters
		@Override
		public String toString() {return comision+": "+nombre+" "+apellido;}
		
		public String getNombre() {return nombre;}
		public String getApellido() {return apellido;}
		public int getEdad() {return edad;}
		public int getComision() {return comision;}
		public String getMateriasAsString()
		{
			String mensaje="";
			if(MateriasAprobadas.isEmpty())
			{
				mensaje=String.format("El alumno %s $s no cursa ninguna de estas materias.", nombre,apellido);
			}
			else
			{
				for(Materia m : MateriasAprobadas)
				{
					mensaje+=m.getNombre();
				}
			}
			return mensaje;
		}
		public ArrayList<Materia> getMateriasAprobadas(){return MateriasAprobadas;}
		// metodos
		public void agregarMAprobada(Materia m_cursadas)
		{
			MateriasAprobadas.add(m_cursadas);
		}
		public void quitarMAprobada(Materia m_cursadas)
		{
			MateriasAprobadas.remove(m_cursadas);
		}
		
		
		
		
}
