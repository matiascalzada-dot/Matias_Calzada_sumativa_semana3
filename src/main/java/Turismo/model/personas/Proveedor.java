package Turismo.model.personas;



public class Proveedor {
    private Persona persona;

    public Proveedor(Persona persona) {
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
        return "Proveedor" +"\n"+
                 persona +
                ".";
    }
}