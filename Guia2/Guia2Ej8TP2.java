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
public class Guia2Ej8TP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   /*
    Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
     */

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero el cual va a determinar el tamanio del cuadrado");
        int cuadrado = leer.nextInt();

        for (int i = 0; i < cuadrado; i++) {
            for (int j = 0; j < cuadrado; j++) {
                if (i == 0) {
                    System.out.print(" * ");
                }else if(i == cuadrado-1) {
                    System.out.print(" * ");
                     } else if (j == 0 ) {
                         System.out.print(" * ");
                     }else if (j == cuadrado-1) {
                         System.out.print(" * ");
                     }else {
                         System.out.print("   ");
                     }
            
            }
          System.out.println(" ");       
        }
          
            
            
            
            
        }

    }
    }
    

