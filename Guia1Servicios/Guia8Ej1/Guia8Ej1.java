/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ej1;

import Servicios.CuentaBancariaServicio;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Guia8Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CuentaBancariaServicio cb1 = new CuentaBancariaServicio();
        int opcion = 0;

        do {
            System.out.println("MENU");
            System.out.println("Opcion 1: Crear cuenta");
            System.out.println("Opcion 2: Ingresar dinero en cuenta");
            System.out.println("Opcion 3: Retirar dinero en cuenta");
            System.out.println("Opcion 4: Retiro rapido de dinero en cuenta");
            System.out.println("Opcion 5: Consultar saldo en cuenta");
            System.out.println("Opcion 6: Consultar datos de cuenta");

            System.out.println("-----------------------------------");

            Scanner leer = new Scanner(System.in);
            System.out.println("Seleccione la opcion:");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    cb1.crearCuenta();
                    break;
                case 2:
                    cb1.ingresarCuenta();
                    break;
                case 3:
                    cb1.retirarCuenta();
                    break;
                case 4:
                    cb1.extraccionRapida();
                    break;
                case 5:
                    cb1.consultarSaldo();
                    break;
                case 6:
                    cb1.mostrarDatos();
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    ;
            }
        } while (opcion != 7);
    }

}

    
    
