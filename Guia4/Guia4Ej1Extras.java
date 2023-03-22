/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4;

import java.util.Scanner;

/**
 *
 * Realizar un algoritmo que calcule la suma de todos los elementos de un vector
 * de tamaño N, con los valores ingresados por el usuario.
 *
 *
 * @author pablcastro
 */
public class Guia4Ej1Extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        CargaVector();

    }

    public static int CargaVector() {
        int i, num;
        int N, suma = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la Dimension del Vector");
        N = leer.nextInt();
        int[] vector = new int[N];
        for (i = 0; i < vector.length; i++) {
            System.out.println("Ingrese los valores del Vector");
            num = leer.nextInt();
            vector[i] = num;
            suma += num;
        }
        System.out.println("La suma de los valores es " + suma);
        return 0;
    }

}
