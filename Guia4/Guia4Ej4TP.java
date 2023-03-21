/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pablcastro
 */
public class Guia4Ej4TP {

    /**
     * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
     * y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz
     * A se denota por B y se obtiene cambiando sus filas por columnas (o
     * viceversa).
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        rellenarMatriz();
    }

    public static int rellenarMatriz() {
        int[][] matriz;
        int[][] matrizTrasp;
        matriz = new int[4][4];
        matrizTrasp = new int[4][4];
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random() * 101);
                matrizTrasp[j][i] = matriz[i][j];
                System.out.print("[" + matriz[i][j] + "]" + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        for (int j = 0; j < matrizTrasp[0].length; j++) {
            for (int i = 0; i < matrizTrasp[0].length; i++) {
                System.out.print( "[" + matrizTrasp[j][i] + "]" + " ");
            }
            System.out.println(" ");
        }
        
        
       return 0; 
    }
}
