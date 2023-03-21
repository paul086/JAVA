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
public class Guia2Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese dos Numeros Enteros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        if (num1 > 25 || num2 > 25) {
        System.out.println("Es Mayor a 25");        
        }else{   
        System.out.println("Es Menor o igual a 25");
        // TODO code application logic here
    }
    }
}
