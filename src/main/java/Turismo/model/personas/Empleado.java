package Turismo.model.personas;

import Turismo.model.identidad.Rut;
import Turismo.model.ubicacion.Direccion;

public class Empleado extends Persona{

    private String carrera;
    private String cargo;

    public Empleado(Persona persona, String carrera, String cargo) {
        super(
                persona.getNombre(),
                persona.getEdad(),
                persona.getDireccion(),
                persona.getRut()
        );

        this.carrera = carrera;
        this.cargo = cargo;
    }

    public Empleado() {
        super();
    }


    @Override
    public String toString() {
        return "Empleado" +"\n"+
                "nombre = " + getNombre() + "\n" +
                "edad = " + getEdad() + "\n" +
                getDireccion() + "\n" +
                "rut = " + getRut() + "\n"+
                "carrera = " + carrera + "\n" +
                "cargo = " + cargo + "\n";
    }
}
