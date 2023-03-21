/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2;

import java.util.Scanner;

/**
 *
 * @author pablcastro
 */
public class Guia3EjExtra3 {

    /**
     * Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se
       trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar
       la función equals() de la clase String.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese una letra por favor");
       String vocal = leer.nextLine();
       if (vocal.equalsIgnoreCase("A") || vocal.equalsIgnoreCase("E") || (vocal.equalsIgnoreCase("I")) || (vocal.equalsIgnoreCase("O")) ||(vocal.equalsIgnoreCase("U")) ) {
           System.out.println("Ingreso una Vocal"); 
       }else{
           System.out.println("No Ingreso una Vocal"); 
       }
       
    }
    
}
