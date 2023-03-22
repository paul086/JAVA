/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4;

import java.util.Random;

/**
 * Crear una función rellene un vector con números aleatorios, pasándole un
 * arreglo por parámetro. Después haremos otra función o procedimiento que
 * imprima el vector.
 *
 *
 * @author pablcastro
 */
public class Guia4Ej3Extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] vectorA = new int[10];
        cargarVector(vectorA);
        imprimirVector(vectorA);
    }

    public static void cargarVector(int[] vector) {
        Random random = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(10);

        }
    }

    public static void imprimirVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print("[" + vector[i] + "]");
        }
    }
}
