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
public class Guia2Ej4TrabajoPractico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una Frase que empiece con A");
        String frase = leer.nextLine();
        if (frase.substring(0,1).equals("A")){
            System.out.println("CORRECTO");
        }else{
        System.out.println("INCORRECTO");
    }
    
}
}
