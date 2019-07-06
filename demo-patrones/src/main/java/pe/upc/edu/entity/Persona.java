package pe.upc.edu.entity;

import java.util.List;

public class Persona {

    private int id;
    private String nombre;
    private int edad;
    private List<Auto> vehiculos;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public List<Auto> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Auto> vehiculos) {
        this.vehiculos = vehiculos;
    }
}
