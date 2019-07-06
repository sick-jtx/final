package com.upc.dao;

import java.util.Collection;
import java.util.HashMap;

import com.upc.dto.Alumno;
import com.upc.singleton.AlumnoMemoria;

public class AlumnoDAOImpl implements AlumnoDAO {

	HashMap<String, Alumno> alumnos = AlumnoMemoria.getAlumnos();

	public boolean crear(Alumno alumno) {

		boolean correctaCreacion = false;

		try {
			alumnos.put(alumno.getCodigo(), alumno);
			correctaCreacion = !correctaCreacion;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return correctaCreacion;
	}

	public boolean eliminar(Alumno alumno) {
		boolean correctaEliminacion = false;

		try {
			alumnos.remove(alumno.getCodigo());
			correctaEliminacion = !correctaEliminacion;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return correctaEliminacion;
	}

	public Collection<Alumno> leer() {

		Collection<Alumno> lista = null;

		if (alumnos.size() > 0) {

			lista = alumnos.values();
		}

		return lista;
	}

	public boolean actualizar(Alumno alumno) {

		boolean correctaActualizar = false;

		try {
			alumnos.put(alumno.getCodigo(), alumno);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return correctaActualizar;
	}

	public Alumno buscar(Alumno alumno) {

		Alumno busqueda = null;

		busqueda = alumnos.get(alumno.getCodigo());

		return busqueda;
	}

}
