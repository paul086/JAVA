/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author pablcastro
 */
public class Puntos {
    public double x1;
    public double y1;
    public double x2;
    public double y2;

    public Puntos() {
    }

    public Puntos(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    
    public void crearPuntos(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los valores para x1, y1, x2, y2");
        this.x1 = leer.nextDouble();
        this.y1 = leer.nextDouble();
        this.x2 = leer.nextDouble();
        this.y2 = leer.nextDouble();
    }
        public double distancia(){
            return Math.sqrt(Math.pow((x1 - x2), 2) + (Math.pow((y1 - y2),2)));
        }
    
    
}
