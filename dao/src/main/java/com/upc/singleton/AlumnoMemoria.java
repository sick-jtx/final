package com.upc.singleton;

import java.util.HashMap;

import com.upc.dto.Alumno;

public class AlumnoMemoria {

	public static HashMap<String, Alumno> alumnos;

	public static HashMap<String, Alumno> getAlumnos() {

		if (alumnos == null) {
			alumnos = new HashMap<String, Alumno>();
		}

		return alumnos;

	}

}
