package Turismo.model.personas;



public class Cliente extends Persona {

    private String paquete;
    private String pais;

    public Cliente(Persona persona, String paquete, String pais) {
        super(
                persona.getNombre(),
                persona.getEdad(),
                persona.getDireccion(),
                persona.getRut()
        );

        this.paquete = paquete;
        this.pais = pais;
    }

    public Cliente() {
        super();
    }


    @Override
    public String toString() {
        return "Cliente" +"\n"+
                "nombre = " + getNombre() + "\n" +
                "edad = " + getEdad() + "\n" +
                getDireccion() + "\n" +
                "rut = " + getRut() + "\n"+
                "paquete = " + paquete + "\n" +
                "viene de = " + pais + "\n";
    }
}
