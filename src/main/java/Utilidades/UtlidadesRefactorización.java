package Utilidades;

import Modelos.Festividad;
import Modelos.Poblacion;
import Modelos.Profesor;

import java.util.ArrayList;
import java.util.List;

public class UtlidadesRefactorización {

    public void printInformacionPersonal(Profesor profesor){
        System.out.println("Nombre: " + profesor.getStr());
        System.out.println("Edad: " + profesor.getEdad());
        System.out.println("Telefono: " + profesor.getNumeroDeTelefono());
    }
    public void printTodaLaInformacion(Profesor profesor){
        System.out.println("Nombre: " + profesor.getStr());
        System.out.println("Edad: " + profesor.getEdad());
        System.out.println("Telefono: " + profesor.getNumeroDeTelefono());
        System.out.println("Prestamos: " + profesor.getPrestamos());
        System.out.println("Esta es toda la información del profesor");
        System.out.println("Fin del método");
    }


    public static void datosEmpresa(String cliente, Poblacion pob){
        System.out.println("Datos del cliente");
        List<String> lc = new ArrayList<>();
        lc.add(cliente);
        System.out.println("Cliente: " + lc);
        if (pob.getNombre().equals("Sevilla")){
            System.out.println(pob.getHabitantes());
        }
    }

}
