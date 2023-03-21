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
public class Guia2Ej8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una Nota de 0 a 10");
        float nota = leer.nextFloat();
        while(nota < 0 || nota > 10){
        System.out.println("La Nota ingresada es incorrecta");         
        System.out.println("Ingrese una Nota de 0 a 10");
        nota = leer.nextFloat();
        }
        
        
    }
    
}
