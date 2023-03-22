/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4;

/**
 *
 * @author pablcastro
 */
public class Guia4Ej2Extras {

    /**
     * Escriba un programa que averigüe si dos vectores de N enteros son iguales
     * (la comparación deberá detenerse en cuanto se detecte alguna diferencia
     * entre los elementos).
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        int[] vectorA = new int[10];
        int[] vectorB = new int[10];
        for (i = 0; i < vectorA.length; i++) {
            vectorA[i] = (int) (Math.random() * 3);
            vectorB[i] = (int) (Math.random() * 3);
        }
        for (i = 0; i < vectorA.length; i++) {
            if (vectorA[i] != vectorB[i]) {
                System.out.println("Hay una diferencia en los Vector A " + vectorA[i] + " Vector B " + vectorB[i]);
            }

        }
        System.out.println(" ");
        for (i = 0; i < vectorA.length; i++) {
            System.out.println("[" + vectorA[i] + "]" + " " + "[" + vectorB[i] + "]" + " ");
        }

        
    }
}
