/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4;

import java.util.Random;
import java.util.Scanner;

/**
 * Los profesores del curso de programación de Egg necesitan llevar un registro
 * de las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de
 * aprobados y desaprobados. Durante el período de cursado cada alumno obtiene 4
 * notas, 2 por trabajos prácticos evaluativos y 2 por parciales. Las
 * ponderaciones de cada nota son: Primer trabajo práctico evaluativo 10%
 * Segundo trabajo práctico evaluativo 15% Primer Integrador 25% Segundo
 * integrador 50% Una vez cargadas las notas, se calcula el promedio y se guarda
 * en el arreglo. Al final del programa los profesores necesitan obtener por
 * pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta que solo
 * aprueban los alumnos con promedio mayor o igual al 7 de sus notas del curso
 *
 *
 * @author pablcastro
 */
public class Guia4Ej4Extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double [][] Matriz = new double[10][5];
        double primerTrabEv, segundoTrabEv,primerIntegrador,segundoIntegrador;
        Scanner leer = new Scanner(System.in);
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
             
                Matriz[i][j] = random.nextInt(10);
               
            }

        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
               
            System.out.print("[" + Matriz[i][j] + "]");
                  
                
            }
            System.out.println(" ");

        }

    }

}
