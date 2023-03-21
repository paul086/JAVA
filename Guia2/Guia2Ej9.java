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
public class Guia2Ej9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1;
        int suma = 0;
        int cont1= 0;
        // TODO code application logic here
       do{
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 20 numeros por favor");
        num1 = leer.nextInt();
        cont1 ++;
        if (num1 > 0){
            suma = suma + num1;
        }
        if (cont1 >= 20){
            break;
        }
    }while (num1 != 0 );
       if (num1 == 0){
       System.out.println("Se capturó el numero cero");    
       }
        System.out.println("Total " + suma);
}
}    
