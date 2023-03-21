/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1ej1;

import java.util.Scanner;

/**
 *
 * @author pablcastro
 */
public class Guia1Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num1 = leer.nextInt(); // Leer un entero
        System.out.println( "El doble es " + num1 * 2);
        System.out.println( "El triple es " + num1 * 3);
        System.out.println( "La raíz cuadrada es " + Math.sqrt(num1) );
    }
    
}
