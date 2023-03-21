/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4;

import java.util.Scanner;

/**
 *
 * @author pablcastro
 */
public class Guia4Ej2TP {

    /**
     * 
     * Realizar un algoritmo que llene un vector de tamaño N con valores
aleatorios y le pida al usuario un número a buscar en el vector. El
programa mostrará dónde se encuentra el numero y si se encuentra
repetido.

     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int N,buscar,repetido=0,contador=0,i;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la Dimension del Vector");
        N = leer.nextInt();
         int[] vector = new int[N];
        for (i = 0; i < vector.length; i++) {
            vector[i] = (int)(Math.random() * 101);
        }
        System.out.println("Ingrese un valor a buscar");
        buscar = leer.nextInt();
        for (i = 0; i < vector.length; i++) {
            if(buscar == vector[i]){
                repetido ++;
                System.out.println("El valor repetido se encuentra en la posicion " + i);
                
            }
            
        }
        
        System.out.println("El valor se repitio " + repetido + " veces");
       //  for (i = 0; i < vector.length; i++) {
         //   System.out.println(vector[i]);
        //}
    }
    
}
