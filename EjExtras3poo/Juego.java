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
public class Juego {

    public int numero1;
    public int numero2;
    public int intentos;
    public int rondas;
    public int puntos1;
    public int puntos2;

    Scanner leer = new Scanner(System.in);

    public Juego() {
        this.intentos = 3;
        this.puntos2 = 0;
        this.puntos1 = 0;
    }

    public Juego(int numero1, int numero2, int rondas) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.rondas = rondas;
        this.intentos = 3;
        this.puntos2 = 0;
        this.puntos1 = 0;
    }

    public void iniciar_juego() {
        System.out.println("Ingrese la Cantidad de Rondas");
        this.rondas = leer.nextInt();
        for (int i = 0; i < rondas; i++) {
            System.out.println("Ingrese el numero a Adivinar");
            this.numero1 = leer.nextInt();
            do {
                System.out.println("Intente adivinar el numero ");
                this.numero2 = leer.nextInt();
                if (numero1 == numero2) {
                    System.out.println("Adivinaste!!!");
                    puntos2++;
                    System.out.println("Puntos para el Jugador 2 " + puntos2);
                    break;
                } else {
                    if (numero2 > numero1) {
                        System.out.println("El numero es mas bajo");
                    } else {
                        System.out.println("El numero es mas alto");
                    }
                    intentos --;
                }

            } while (intentos > 0);
            if (intentos == 0) {
                puntos1++;
                System.out.println("Perdiste!!!");
                System.out.println("Puntos para el Jugador 1 " + puntos1);
            }
            intentos = 3;
        }
        if (puntos2 > puntos1 ) {
            System.out.println("Gano el Jugador 2! Puntos: " + puntos2);
            
        }
        if (puntos2 == puntos1 ) {
            System.out.println("Empataron ambos Jugadores! Puntos: " + puntos2);
            
        }
        if (puntos2 < puntos1 ) {
            System.out.println("Gano el Jugador 1! Puntos: " + puntos1);
            
        }
        
    }

}
