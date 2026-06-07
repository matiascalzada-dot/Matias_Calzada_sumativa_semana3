package Turismo.app;

import Turismo.model.identidad.Rut;
import Turismo.model.personas.*;
import Turismo.model.ubicacion.Direccion;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try{
            Direccion tarragona = new Direccion("tarragona 123","maipu","metropolitana");
            Rut rutPablo = new Rut("12432765-9");
            Persona pablo = new Persona("pablo", 43,tarragona,rutPablo);

            Direccion doggis = new Direccion("doggis 007", "Ñuñoa","metropolitana");
            Rut rutJose = new Rut("15432654-8");
            Persona jose = new Persona("Jose",32,doggis, rutJose);

            Direccion king = new Direccion("king 321","Florida", "metropolitana");
            Rut rutCamilo = new Rut("12234456-8");
            Persona camilo = new Persona("Camilo", 23,king, rutCamilo);

            Rut rutMario = new Rut("10321654-k");
            Persona mario = new Persona("mario", 77,doggis,rutMario);


            Empleado pabloemp = new Empleado(pablo,"abogado","proveedor");
            Empleado camiloemp = new Empleado(camilo,"medico","guia");
            Empleado joseemp = new Empleado(jose,"cirujano","operador");

            Cliente mariocli = new Cliente(mario,"paquete premium","italia");

            System.out.println();
            System.out.println(pabloemp);
            System.out.println();
            System.out.println(camiloemp);
            System.out.println();
            System.out.println(joseemp);
            System.out.println();
            System.out.println(mariocli);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}