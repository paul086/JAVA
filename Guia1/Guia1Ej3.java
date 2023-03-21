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
public class Guia1Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String Frase = leer.nextLine(); // Leer un entero
        System.out.println(Frase.toUpperCase());
        System.out.println(Frase.toLowerCase());
    }
    
}
