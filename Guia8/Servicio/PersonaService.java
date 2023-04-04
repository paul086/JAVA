/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author pablcastro
 */
public class PersonaService {

    public static Persona crearPersona() {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el nombre: ");
        String nombre = leer.nextLine();

        System.out.print("Ingrese la edad: ");
        int edad = leer.nextInt();
        leer.nextLine(); // Consumimos el salto de línea pendiente

        System.out.print("Ingrese el DNI: ");
        String dni = leer.nextLine();

        return new Persona(nombre, edad, dni);
    }

    public static void mostrarPersona(Persona persona) {
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("DNI: " + persona.getDNI());
    }

}
