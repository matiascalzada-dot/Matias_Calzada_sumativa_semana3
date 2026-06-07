package Turismo.model.identidad;

import Turismo.exceptions.RutInvalidoException;

public class Rut {
    private String numero;

    public Rut(String numero) {
        this.numero = numero;
    }

    public String getNumero(){
        return numero;

    }
    public Rut(){

    }
    public void setNumero(String numero) throws RutInvalidoException {

        if(numero == null || !numero.matches("[0-9]+-[0-9kK]")){
            throw new RutInvalidoException("El rut  " + numero + " no tiene un formato valido, debe ser el patron xxxxxxxx-y");


        }
        this.numero = numero;

    }

    @Override
    public String toString() {
        return  numero ;
    }
}
