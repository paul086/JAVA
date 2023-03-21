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
public class Guia1Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la Temperatura en °C: ");
        int temp = leer.nextInt(); // Leer un entero
        int F = 32 + (9 * temp / 5);
        System.out.println(F + " Fahrenheit");
    }
    
}
