package com.ValirarCorrelatividades.validarcorrelatividades;

import java.util.ArrayList;

import com.ValidarCorrelatividades.modelos.*;

/**
 * Hello world!
 *
 */
public class App 
{
    
    	static Alumno a_Jose;
    	static Alumno a_Maria;
    	static Alumno a_Pedro;
    	static Alumno a_Romina;	
    	static Materia m_Computacion;
    	static Materia m_Ingles;
    	static Materia m_MatDiscreta;
    	
    	static ArrayList<Alumno> alumnado=new ArrayList<Alumno>();;
    	
    	public static void main(String[] args) {
    		a_Jose= new Alumno("Jose","Rodriguez",25,23562);
    		a_Maria= new Alumno("Maria","Perez",21,23562);
    		a_Pedro= new Alumno("Pedro","Pascal",28,23652);
    		a_Romina= new Alumno("Romina","Gomez",25,23652);
    		m_Computacion=new Materia("Computacion");
    		m_Ingles=new Materia("Ingles");
    		m_MatDiscreta=new Materia("Matematica Discreta");
    		
    		m_Computacion.agregarCorrelativa(m_Ingles);
    		m_Computacion.agregarCorrelativa(m_MatDiscreta);
    		
    		a_Jose.agregarMAprobada(m_Ingles);
    		a_Pedro.agregarMAprobada(m_Ingles);
    		a_Pedro.agregarMAprobada(m_MatDiscreta);
    		a_Romina.agregarMAprobada(m_Ingles);
    		a_Romina.agregarMAprobada(m_MatDiscreta);
    		alumnado.add(a_Jose);
    		alumnado.add(a_Maria);
    		alumnado.add(a_Pedro);
    		alumnado.add(a_Romina);
    	
    		for(Alumno a : alumnado)
    		{
    			System.out.println(evaluar(m_Computacion,a));
    		}
    		
    		
    	}
    	public static String evaluar(Materia m_aEvaluar,Alumno alumnoEvaluado)
    	{
    		String resultado;
    		ArrayList<Materia> listaCorrel=m_aEvaluar.getCorrelativas();
    		ArrayList<Materia> materiasAlum=alumnoEvaluado.getMateriasAprobadas();
    		int correlatividad=listaCorrel.size();
    		int aciertos=0;
    		for(Materia M : listaCorrel)
    		{
    			for(Materia m : materiasAlum)
    			{
    				if(m==M)
    				{
    					aciertos++;
    				}
    			}
    		}
    		
    		if(correlatividad==aciertos) resultado=alumnoEvaluado.toString()+" puede cursar "+ m_aEvaluar.getNombre();
    		else resultado=alumnoEvaluado.toString()+" no puede cursar "+ m_aEvaluar.getNombre();
    		return resultado;
    		
    	}

    }

