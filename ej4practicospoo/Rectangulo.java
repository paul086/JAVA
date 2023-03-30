/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4practicospoo;

import java.util.Scanner;

/**
 *
 * @author pablcastro
 */
public class Rectangulo {

    private double lado1;
    private double lado2;

    public Rectangulo() {
    }

    public Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public void crearRectangulo() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el Lado 1 y el Lado 2");
        this.lado1 = leer.nextDouble();
        this.lado2 = leer.nextDouble();
    }

    public double superficieRectangulo() {
        return lado1 * lado2;
    }

    public double perimetroRectangulo() {
        return (lado1 * 2) + (lado2 * 2);
    }

    public void dibujoRectangulo() {
        for (int i = 0; i < lado2; i++) {
            for (int j = 0; j < lado1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
