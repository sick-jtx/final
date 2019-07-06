package com.upc.controller;

import java.util.Collection;
import java.util.Scanner;

import com.upc.dto.Alumno;
import com.upc.service.AlumnoService;
import com.upc.service.AlumnoServiceImpl;

public class AlumnoController {

	AlumnoService alumnoService = new AlumnoServiceImpl();

	public void crear(Alumno alumno) {

		if (alumnoService.crear(alumno)) {
			System.out.println("Registro de Alumno correctamente");
		} else {
			System.out.println("Error en el registro");
		}

	}

	public void eliminar(Alumno alumno) {
		if (alumnoService.eliminar(alumno)) {
			System.out.println("Elimino el Alumno correctamente");
		} else {
			System.out.println("Error en la eliminacion");
		}
	}

	public void leer() {

		System.out.println("Lista de Alumnos\n\n");

		Collection<Alumno> alumnos = alumnoService.leer();

		if (alumnos != null) {
			for (Alumno alumno : alumnoService.leer()) {
				System.out.println(alumno.toString());
			}
		} else {
			System.out.println("No hay alumnos registrados");
		}
	}

	public void actualizar(Alumno alumno) {
		if (alumnoService.actualizar(alumno)) {
			System.out.println("Actualizo el Alumno correctamente");
		} else {
			System.out.println("Error en la Actualizacion");
		}
	}

	public static void main(String[] args) {

		Alumno alumno;

		AlumnoController alumnoController = new AlumnoController();
		Scanner scanner = new Scanner(System.in);

		int opcion;

		String auxiliar1;
		int auxiliar2;

		while (true) {

			System.out.println("\nDigite una de las opciones y 0 para salir");

			System.out.println("1. Crear Alumno");
			System.out.println("2. Leer Alumno");
			System.out.println("3. Actualizar Alumno");
			System.out.println("4. Eliminar Alumno");

			System.out.print("Digita la Opcion: ");
			opcion = scanner.nextInt();

			switch (opcion) {
			case 0:
				break;

			case 1:
				alumno = new Alumno();

				System.out.print("Ingresa Codigo: ");
				alumno.setCodigo(scanner.next());

				System.out.print("Ingresa Nombre: ");
				alumno.setNombre(scanner.next());

				System.out.print("Ingresa Edad: ");
				alumno.setEdad(scanner.nextInt());

				System.out.print("Ingresa Telefono: ");
				alumno.setTelefono(scanner.next());

				alumnoController.crear(alumno);

				continue;

			case 2:

				alumnoController.leer();

				continue;

			case 3:
				alumno = new Alumno();

				System.out.print("Ingresa Codigo: ");
				alumno.setCodigo(scanner.next());

				System.out.print("Ingresa Nombre: ");
				alumno.setNombre(scanner.next());

				System.out.print("Ingresa Edad: ");
				alumno.setEdad(scanner.nextInt());

				System.out.print("Ingresa Telefono: ");
				alumno.setTelefono(scanner.next());

				alumnoController.actualizar(alumno);

				continue;
			case 4:

				alumno = new Alumno();

				System.out.print("Ingresa Codigo a eliminar: ");
				alumno.setCodigo(scanner.next());

				alumnoController.eliminar(alumno);
				continue;

			}

			break;

		}

	}

}
