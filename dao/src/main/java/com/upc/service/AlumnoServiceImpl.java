package com.upc.service;

import java.util.Collection;

import com.upc.dao.AlumnoDAO;
import com.upc.dao.AlumnoDAOImpl;
import com.upc.dto.Alumno;

public class AlumnoServiceImpl implements AlumnoService {

	AlumnoDAO alumnoDAO = new AlumnoDAOImpl();

	public boolean crear(Alumno alumno) {

		boolean creacionCorrecta = false;

		if (alumnoDAO.buscar(alumno) == null) {
			alumnoDAO.crear(alumno);
			creacionCorrecta = !creacionCorrecta;
		}

		return creacionCorrecta;
	}

	public boolean eliminar(Alumno alumno) {
		boolean eliminacionCorrecta = false;

		if (alumnoDAO.buscar(alumno) != null) {
			alumnoDAO.eliminar(alumno);
			eliminacionCorrecta = !eliminacionCorrecta;
		}

		return eliminacionCorrecta;
	}

	public Collection<Alumno> leer() {

		return alumnoDAO.leer();
	}

	public boolean actualizar(Alumno alumno) {
		boolean actualizacionCorrecta = false;

		if (alumnoDAO.buscar(alumno) != null) {
			alumnoDAO.actualizar(alumno);
			actualizacionCorrecta = !actualizacionCorrecta;
		}

		return actualizacionCorrecta;
	}

}
