/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Geometria;

import java.util.Scanner;

/**
 *
 * @author pablcastro
 */
public class Circunferencia {
    public double radio;
    public double Area;
    public double Perimetro;
    
    public Circunferencia(double radio, double Area, double Perimetro) {
        this.radio = radio;
        this.Area = Area;
        this.Perimetro = Perimetro;
    }

    
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public void crearCircunferencia(){
        System.out.println("Ingrese el radio");
        Scanner leer = new Scanner(System.in);
        radio = leer.nextDouble();
    } 
    public double area(){
        Area = Math.PI * Math.pow(radio, 2);
        return Area;
    }
    public double perimetro(){
        Perimetro = 2 * Math.PI * radio;
        return Perimetro;
    }
    
}
