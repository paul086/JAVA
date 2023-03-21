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
public class Guia3TP1 {

    /**
     * 
     * 
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese dos numeros");
        System.out.print("\nIngrese primer numero:  ");
        float num1 = leer.nextFloat();
        System.out.print("\nIngrese segundo numero:  ");
        float num2 = leer.nextFloat();
        boolean salida= false;
        String sal = "";
//        do {
         while (salida==false){
            System.out.println("Elija una opcion del Menu\n"
                    + "MENU\n"
                    + "1.Sumar\n"
                    + "2.Restar\n"
                    + "3.Multiplicar\n"
                    + "4.Dividir\n"
                    + "5.Salir");

            int opc = leer.nextInt();
            while (opc < 1 || opc > 5) {
                System.out.println("La opcion debe ser entre 1 y 5\n"
                        + "Ingresar nuevamente");
                opc = leer.nextInt();
            }

            switch (opc) {
                case 1:
                    System.out.println("La suma de " + num1 + " + " + num2 + " = " + sumar(num1, num2));
                    break;
                case 2:
                    System.out.println("La resta de " + num1 + " - " + num2 + " = " + restar(num1, num2));
                    break;
                case 3:
                    System.out.println("La multiplicacion de " + num1 + " * " + num2 + " = " + multiplicar(num1,num2));
                    break;
                case 4:
                    System.out.println("La division de " + num1 + " / " + num2 + " = " + dividir(num1,num2));
                    break;
                case 5:
                    System.out.println("Realmente desea salir del programa?"
                            + "(S) para salir, (N) para continuar");

                    sal = leer.next();

                    if (sal.equalsIgnoreCase("s")) {
                        salida= true;
                        break;
                    }else 
                        salida= false;
                        

            }
    }
         }
    public static float sumar(float numero1, float numero2){
        float suma = numero1 + numero2;
        return suma;
    
    }
     public static float restar(float numero1, float numero2){
        float resta = numero1 - numero2;
        return resta;
    
    }
      public static float multiplicar(float numero1, float numero2){
        float mult = numero1 * numero2;
        return mult;
    
    }
       public static float dividir(float numero1, float numero2){
        float div = numero1 / numero2;
        return div;
    
    }
}
