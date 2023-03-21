/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4;

/**
 *
 * Recorrer un vector de N enteros contabilizando cuántos números son de 1
 * dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 *
 * @author pablcastro
 */
public class Guia4Ej3TP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int unDigito = 0, dosDigito = 0, tresDigito = 0, cuatroDigito = 0, cincoDigito = 0, i;
        int[] vector = new int[100];
        for (i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 100001);
        }

        for (i = 0; i < vector.length; i++) {
            if (vector[i] <= 9 && vector[i] >= 0) {
                unDigito ++;
                continue;
            }
            if (vector[i] <= 99 && vector[i] >= 10) {
                dosDigito ++;
                continue;
            }
            if (vector[i] <= 999 && vector[i] >= 100) {
                tresDigito ++;
               continue;
            }
            if (vector[i] <= 9999 && vector[i] >= 1000) {
                cuatroDigito++;
                continue;
            }
            if (vector[i] <= 99999 || vector[i] >= 10000) {
                cincoDigito++;
               continue;
            }
            System.out.println(vector[i]);
            
        }
        System.out.println("Los numeros de un Digito son " + unDigito);
        System.out.println("Los numeros de dos Digito son " + dosDigito);
        System.out.println("Los numeros de tres Digito son " + tresDigito);
        System.out.println("Los numeros de cuatro Digito son " + cuatroDigito);
        System.out.println("Los numeros de cinco Digito son " + cincoDigito);
    }

}
