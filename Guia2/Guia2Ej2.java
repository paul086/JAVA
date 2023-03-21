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
public class Guia2Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        String palabra;
        System.out.println("Ingrese una palabra.");
        palabra = read.next();
        if (palabra.equalsIgnoreCase("eureka")){
            System.out.println("La palabra es correcta!");
        } else {
            System.out.println("La palabra es incorrecta!");
        }
    }
}
  
    

