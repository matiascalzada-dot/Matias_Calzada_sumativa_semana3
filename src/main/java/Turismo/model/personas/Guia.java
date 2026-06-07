package Turismo.model.personas;

import Turismo.model.ubicacion.Direccion;

public class Guia extends Empleado{
    private Persona persona;

    public Guia(Persona persona) {
        this.persona = persona;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "Guia" +"\n"+
                 persona +
                ".";
    }
}
