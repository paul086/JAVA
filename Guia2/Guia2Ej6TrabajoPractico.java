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
public class Guia2Ej6TrabajoPractico {

    /**
     * @param args the command line arguments
     *///    Realizar un programa que pida dos números enteros positivos por
//teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir
//una opción y el programa deberá mostrar el resultado por pantalla y
//luego volver al menú. El programa deberá ejecutarse hasta que se elija la
//opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
//vez de salir del programa directamente, se debe mostrar el siguiente
//mensaje de confirmación: ¿Está seguro que desea salir del programa
//(S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
//contrario se vuelve a mostrar el menú.
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
                    System.out.println("La suma de " + num1 + " + " + num2 + " = " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("La resta de " + num1 + " - " + num2 + " = " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("La multiplicacion de " + num1 + " * " + num2 + " = " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("La division de " + num1 + " / " + num2 + " = " + (num1 / num2));
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

//                  continue;
//        return;
        
//        system("cls");

    }
    }
    
}
