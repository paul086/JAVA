/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author pablcastro
 */
public class Guia3TP4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num1;
        System.out.println("Ingrese el número que desea comparar");
        num1 = leer.nextInt();
        System.out.println(comparar(num1));

    }

    static public boolean comparar(int num1) {
       
        boolean prime = true;
        for (int i = 2; i < num1; i++) {
            if (num1 % i == 0) {
                prime = false;
                break;
            }
        }
     return prime;
 }
}
        
    
    

