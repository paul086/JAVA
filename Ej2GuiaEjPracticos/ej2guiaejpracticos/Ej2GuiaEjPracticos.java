/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2guiaejpracticos;

import Geometria.Circunferencia;

/**
 *
 * @author pablcastro
 */
public class Ej2GuiaEjPracticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circunferencia circulo = new Circunferencia(20,0,0);
        
        System.out.println("Area es " + circulo.area() + " " + "Perimetro es " + circulo.perimetro() );
    }
    
}
