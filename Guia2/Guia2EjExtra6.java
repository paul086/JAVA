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
public class Guia2EjExtra6 {

    /**
     * 
     * Leer la altura de N personas y determinar el promedio de estaturas que
       se encuentran por debajo de 1.60 mts. y el promedio de estaturas en
       general.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner leer = new Scanner(System.in);
       float altura, totalAltura=0;
       int nPersonas;
       int cont = 0;
       float promDeb= 0, promGeneral=0;
       System.out.println("Ingrese la Cantidad de Personas");
       nPersonas = leer.nextInt();
       for (int i=0; i<nPersonas;i++){
       System.out.println("Ingrese la Altura de las Personas " + nPersonas);
       altura = leer.nextFloat();
       totalAltura = totalAltura + altura;
       if (altura < 1.60){
           cont ++;
           promDeb = promDeb + altura;
       }
    }
        System.out.println("El promedio de estaturas que se encuentran por debajo de 1.60 mts " + promDeb/cont );
        System.out.println("El Promedio de Estaturas en General son " + totalAltura/nPersonas );
    
}
}