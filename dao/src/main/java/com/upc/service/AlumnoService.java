package com.upc.service;

import java.util.Collection;

import com.upc.dto.Alumno;

public interface AlumnoService {

	boolean crear(Alumno alumno);

	boolean eliminar(Alumno alumno);

	Collection<Alumno> leer();

	boolean actualizar(Alumno alumno);

}
