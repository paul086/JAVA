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
public class Guia2Ej5TP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escriba un programa en el cual se ingrese un valor límite positivo, y a
        //continuación solicite números al usuario hasta que la suma de los
        //números introducidos supere el límite inicial.
         Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor Limite Positivo");
        int limite = leer.nextInt();
        int num;
        int suma=0;
        while(limite <=0){
            System.out.println("Ingrese un valor mayor a 0 por favor");
            limite = leer.nextInt();
            }
        
        do{
        System.out.println("Ingrese Numeros hasta que supere el limite la suma");         
        num = leer.nextInt();
        suma = num + suma;
        System.out.println("Suma es " + suma);         
        }while(suma < limite );
        
}
}