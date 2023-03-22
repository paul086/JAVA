/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4;

import java.util.Random;

/**
 *
 * @author pablcastro
 */
public class InteligenciaArtificial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here     
        int[] array = new int[10]; // Crea un arreglo de 10 elementos
        fillArrayWithRandomNumbers(array); // Llama a la función para llenar el arreglo con números aleatorios
        printArray(array); // Llama al procedimiento para imprimir el arreglo
    }

    // Función para llenar un arreglo con números aleatorios
    public static void fillArrayWithRandomNumbers(int[] arr) {
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100); // Llena cada elemento del arreglo con un número aleatorio entre 0 y 100
        }
    }

    // Procedimiento para imprimir un arreglo
    public static void printArray(int[] arr) {
        System.out.print("[ ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("]");
    }
}


