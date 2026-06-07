package Turismo.model.personas;


public class Operador {
    private Persona persona;

    public Operador(Persona persona) {
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
        return "Operador" +"\n"+
                 persona +
                ".";
    }
}
