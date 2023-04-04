/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej01;

import Entidad.Persona;
import Servicio.PersonaService;
import java.util.Scanner;
import jdk.nashorn.internal.ir.BreakNode;

/**
 *
 * @author pablcastro
 */
public class POOEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String respuesta;
        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("Ingrese los Datos de la Persona");
            Persona persona = PersonaService.crearPersona();
            System.out.println(" ");
            PersonaService.mostrarPersona(persona);
            System.out.println(" ");
            System.out.println("Desea crear Otra Persona");
            respuesta = leer.nextLine();
        } while (respuesta.equalsIgnoreCase("si"));
        System.out.println("Saludos");
        System.out.flush();
    }

}
