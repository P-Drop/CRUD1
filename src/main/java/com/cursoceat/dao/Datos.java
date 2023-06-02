package com.cursoceat.dao;


import java.util.Iterator;

import com.cursoceat.xml.schema.Centro;
import com.cursoceat.xml.schema.Centro.Alumno;

public class Datos {

	public static Centro miAcademia = new Centro();
	
	public static Centro getCentro() {
		return miAcademia;
	}


	public static boolean validar(String nom, Integer n) {
		return true;
	}
	
	public static void crearAlumno(String nom, Integer n) {
		miAcademia.getAlumno();
		miAcademia.crearAlumno(nom, n);	
	}
	public static void eliminar(String nom) {
		Iterator<Alumno> it = miAcademia.getAlumno().iterator();
		while(it.hasNext()) {
			Alumno a = it.next();
			if(nom.equals(a.getNombre())) {
				it.remove();
			}
		}
	}
	
	public static void modificar(String nom, String nuevoN, Integer nuevaE) {
		Iterator<Alumno> it = miAcademia.getAlumno().iterator();
		while(it.hasNext()) {
			Alumno a = it.next();
			if(nom.equals(a.getNombre())) {
				a.setNombre(nuevoN);
				a.setEdad(nuevaE);
			}
		}
		
	}
}
