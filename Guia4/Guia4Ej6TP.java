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
public class Guia4Ej6TP {

    /**
     * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al
     * 9 donde la suma de sus filas, sus columnas y sus diagonales son
     * idénticas. Crear un programa que permita introducir un cuadrado por
     * teclado y determine si este cuadrado es mágico o no. El programa deberá
     * comprobar que los números introducidos son correctos, es decir, están
     * entre el 1 y el 9. 3
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        cajaMagica();
    }

    public static int cajaMagica() {
        int[][] matriz = new int[3][3];
        Scanner leer = new Scanner(System.in);
        int num1, diagonalPrincipal = 0, lineaCentral = 0, lineaVertical = 0, i, j;
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz.length; j++) {
                do {
                    System.out.println("Ingrese los valores del Cuadrado Mágico del 1 al 9");
                    num1 = leer.nextInt();
                    matriz[i][j] = num1;
                } while (num1 < 1 || num1 > 9);

            }
        }
        System.out.println(" ");
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz.length; j++) {
                System.out.print("[" + matriz[i][j] + "]" + " ");
                if (i == j) {
                diagonalPrincipal = diagonalPrincipal + matriz[i][j];
                
            }
            if (i == 1 && j <= 2) {
                lineaCentral = lineaCentral + matriz[i][j];
           
            }
            if (i <= 2 && j == 0) {
                lineaVertical = lineaVertical + matriz[i][j];
         
            }
            }
            System.out.println(" ");
            
        }
        if (diagonalPrincipal == lineaCentral && diagonalPrincipal == lineaVertical) {
            System.out.println("La Caja es Mágica");
        } else {
            System.out.println("La Caja NO es Mágica");
        }

        return 0;
    }
}
