/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Scanner;

/**
 *Diseñe una función que pida el nombre y la edad de N personas e
imprima los datos de las personas ingresadas por teclado e indique si
son mayores o menores de edad. Después de cada persona, el programa
debe preguntarle al usuario si quiere seguir mostrando personas y frenar
cuando el usuario ingrese la palabra “No”.
 * 
 * 
 * @author pablcastro
 */
public class Guia3TP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int nPersonas,edad=0;
       String sal="SI";
       String nombre="";
       System.out.println("Ingrese la cantidad de Personas");
       Scanner leer = new Scanner(System.in);
        nPersonas = leer.nextInt();
        for (int i=0; i< nPersonas -1; i++){
           System.out.println("La edad es " +  personas(edad,nombre));
            //if (i==0){
           System.out.println("Desea seguir cargando SI/NO");
           sal = leer.next();
           if (sal.equalsIgnoreCase("NO")) {
               System.exit(0);
           }else{ 
               
               System.out.println("La edad es " +  personas(edad,nombre));
               System.out.println("Desea seguir cargando SI/NO");
               sal = leer.next();         
                       
           }
            System.out.println("");
            break;
   //}
   }    
   }
    

    
    public static String personas(int edades, String nombres){   
       Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese la edad de la Persona");
        edades = leer.nextInt();
        if (edades>18){
            
        }
        System.out.println("Ingrese el nombre de la Persona");
        nombres = leer.next();
       return edades +" y el nombre es "+ nombres;
      
    }
    
}