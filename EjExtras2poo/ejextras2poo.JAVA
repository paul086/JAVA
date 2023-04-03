/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejextras2poo;

import Entidades.Puntos;

/**
 *
 * @author pablcastro
 */
public class EjExtras2POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Puntos puntoss = new Puntos();
        puntoss.crearPuntos();
        System.out.println("La distancia que existe entre los dos puntos " + puntoss.distancia() );
}
}
