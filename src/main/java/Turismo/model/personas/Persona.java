package Turismo.model.personas;

import Turismo.model.identidad.Rut;
import Turismo.model.ubicacion.Direccion;

public class Persona {

    private String nombre;
    private int edad;
    private Direccion direccion;
    private Rut rut;

    public Persona(){

    }
    public Persona(String nombre, int edad, Direccion direccion, Rut rut) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.rut = rut;
    }
    public Persona(int edad, Direccion direccion, Rut rut) {
        this.edad = edad;
        this.direccion = direccion;
        this.rut = rut;
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

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Rut getRut() {
        return rut;
    }

    public void setRut(Rut rut) {
        this.rut = rut;
    }


}
