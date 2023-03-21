/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author pablcastro
 */
public class Guia3TP2funcionamejor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        datos();
    }
   public static void datos(){
       Scanner leer = new Scanner(System.in);
             
       String respuesta ;
        do{
        System.out.println("Ingrese el nombre de la persona");
        String nombre = leer.next();
        System.out.println("Ingrese  la edad de la persona");
        int edad = leer.nextInt();
        if(edad<18){
            System.out.println(nombre +" Es menor de 18");
        }
        else{
            System.out.println(nombre+" Es mayor a 18");
        }   
         System.out.println("quiere seguir agregando datos,SI/NO");
          respuesta = leer.next();
        
   }
        while(!respuesta.equalsIgnoreCase("NO"));
        
   }

}
   
        // TODO code application logic here
    

