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
public class Guia1Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int numEntero = leer.nextInt(); // Leer un entero
        System.out.println("Ingrese un numero entero");
        int numEntero2 = leer.nextInt(); // Leer un entero
        int suma = numEntero + numEntero2;
        System.out.println("El resultado es " + suma );
    }
       
    }
  
