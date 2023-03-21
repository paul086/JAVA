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
public class Guia3Ej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingrese dos numeros enteros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        multiplo(num1, num2);
    }
    public static void multiplo(int numero1, int numero2){
        if (numero1 % numero2 == 0){
            System.out.println("El numero 1 es multiplo del 2");
        }else{
            System.out.println("No es Multiplo");
        }
        
    }
}
