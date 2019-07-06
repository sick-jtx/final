package com.upc.dao;

import java.util.Collection;

import com.upc.dto.Alumno;

public interface AlumnoDAO {

	boolean crear(Alumno alumno);

	boolean eliminar(Alumno alumno);

	Collection<Alumno> leer();

	boolean actualizar(Alumno alumno);

	Alumno buscar(Alumno alumno);
}
