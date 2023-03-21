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
public class Guia4Ej5TP {

    /**
     *
     * 5. Realice un programa que compruebe si una matriz dada es antisimétrica.
     * Se dice que una matriz A es antisimétrica cuando ésta es igual a su
     * propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica
     * si A = AT. La matriz traspuesta de una matriz A se denota por AT y se
     * obtiene cambiando sus filas por columnas (o viceversa).
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Definir Variables y Matrices
        int[][] matrizA;
        int[][] matrizB;
        Scanner leer = new Scanner(System.in);
        boolean esAntisimetrica = false;
        int i, j;
        //Ingreso de i y j que van ser las Dimensiones de las Matrices A(i,j) y B(i,j)
        System.out.println("Ingrese la dimension de la Matriz");
        System.out.println("i");
        int num1 = leer.nextInt();
        System.out.println("j");
        int num2 = leer.nextInt();
        //Una vez que tenemos los valores de i y j Creamos la Matriz con sus dimensiones por ej 3+3
        matrizA = new int[num1][num2];
        matrizB = new int[num1][num2];
        //Carga de MAtrices A y B
        for (i = 0; i < matrizA.length; i++) {
            for (j = 0; j < matrizA.length; j++) {
                System.out.println("Ingrese los valores de " + "[" + i + "]" + "[" + j + "]");
                matrizA[i][j] = leer.nextInt();
                matrizB[j][i] = matrizA[i][j];
            }
        }
        for (j = 0; j < matrizB.length; j++) {
            for (i = 0; i < matrizB.length; i++) {
                System.out.println("Ingrese los valores de " + "[" + i + "]" + "[" + j + "]");
                matrizB[j][i] = matrizA[i][j];
            }
        }
        System.out.println("Matriz");
        for (i = 0; i < matrizA.length; i++) {
            for (j = 0; j < matrizA.length; j++) {
                System.out.print("[" + matrizA[i][j] + "]" + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println("Matriz Transpuesta");
        for (i = 0; i < matrizB.length; i++) {
            for (j = 0; j < matrizB.length; j++) {
                System.out.print("[" + matrizB[i][j] + "]" + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        for (i = 0; i < matrizA.length; i++) {
            for (j = 0; j < matrizA.length; j++) {
                if (matrizA[i][j] == -matrizB[j][i]) {
                    esAntisimetrica = true;
                    break;
                }
            }

        }

        if (esAntisimetrica) {
            System.out.println("La matriz es antisimetrica.");
        } else {
            System.out.println("La matriz no es antisimetrica.");
        }

    }

}
