/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2;

import java.util.Scanner;

/**
 *Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
  ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
equivalente: 1 día, 2 horas.
 * 
 * @author pablcastro
 */
public class Guia2EjExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tiempo = new Scanner(System.in);
        System.out.println("Ingrese un valor en minutos");
        int min = tiempo.nextInt();
        int dia = min/(24*60);
        int hora=(min%(24*60)/60);

       
        
         System.out.println(dia + "dias, " + hora + " horas");
              
        }
    }
    

