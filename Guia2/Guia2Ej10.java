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
public class Guia2Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      int cont = 4;
      int num1;
      Scanner leer = new Scanner(System.in);
      System.out.println("Ingrese 4 Numeros comprendidos entre 1 a 20" );
      do {
            num1 = leer.nextInt();   
            System.out.print(num1);
         if (num1 >= 1 && num1 <= 20 ){
             cont --;
             
         for (int i = 0; i < num1; i++){
        
           System.out.print("*");
       } 
           System.out.println("");
            }
         } while (num1 < 1 || num1 > 20 || cont !=0 );
         
    }    
    }
    

