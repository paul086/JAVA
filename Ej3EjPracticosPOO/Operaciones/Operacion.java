/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

import java.util.Scanner;

/**
 *
 * @author pablcastro
 */
public class Operacion {
    private int numero1;
    private int numero2;

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    public void crearOperacion(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los dos Numeros");
        numero1 = leer.nextInt();
        numero2 = leer.nextInt();
    }
    public int sumar(){
        return numero1 + numero2; 
    }
    public int restar(){
        return numero1 - numero2;
    }
    public int multiplicar(){
        if (numero1 != 0 || numero2 != 0){
            return numero1 * numero2;
        
    }else{
            return numero1 * numero2;
            
        }
        }
}
