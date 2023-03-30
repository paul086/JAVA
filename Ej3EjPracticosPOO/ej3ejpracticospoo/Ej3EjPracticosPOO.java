/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3ejpracticospoo;

import Operaciones.Operacion;
import java.util.Scanner;

/**
 *
 * @author pablcastro
 */
public class Ej3EjPracticosPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner LeerDato = new Scanner(System.in);
        System.out.println("1-Sumar, 2-Restar, 3-");
        //int opcion = LeerDato.nextInt();
        Operacion Suma = new Operacion();
        Suma.crearOperacion();
        System.out.println( "La Suma " + Suma.sumar());
        System.out.println( "La Resta es " + Suma.restar());
        
    }
    
}
