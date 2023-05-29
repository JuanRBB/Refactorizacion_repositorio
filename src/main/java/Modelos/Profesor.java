package Modelos;

import lombok.Data;

import java.util.List;
@Data
public class Profesor extends Persona{

    String str;
    int edad;
    String numeroDeTelefono;
    List<Prestamo> prestamos;

    public Profesor(String numeroDeTelefono){
        super(numeroDeTelefono);
    }

    public void printTodaLaInformacion(){
        System.out.println("Nombre: "+str);
        System.out.println("Edad: "+edad);
        System.out.println("Teléfono: "+this.numeroDeTelefono);
        for(Prestamo p: prestamos) {
            System.out.println(p);
        }
    }
}
