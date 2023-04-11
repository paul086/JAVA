/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;


import Entidades.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class CuentaBancariaServicio {

    Scanner leer = new Scanner(System.in);

    CuentaBancaria cuenta1 = new CuentaBancaria();

    public void crearCuenta() {
        System.out.println("Ingrese el numero de cuenta: ");
        cuenta1.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese el DNI del cliente: ");
        cuenta1.setDniCliente(leer.nextLong());
    }

    public void ingresarCuenta() {
        System.out.println("Ingrese el valor para agregar al saldo:");
        double ingreso = leer.nextDouble();
        cuenta1.setSaldoActual((cuenta1.getSaldoActual() + ingreso));
    }

    public void extraccionRapida() {
        System.out.println("Ingrese el valor para extraer de la cuenta:");
        double retiro = leer.nextDouble();
        if ((cuenta1.getSaldoActual() * 0.20) < retiro) {
            cuenta1.setSaldoActual((cuenta1.getSaldoActual() - retiro));
//        break;
        } else {
            System.out.println("Ingrese un valor menor al 20 % del saldo en cuenta");
        }
    }

    public void retirarCuenta() {
        System.out.println("Ingrese el valor para extraer de la cuenta:");
        double retiro = leer.nextDouble();
           if ((cuenta1.getSaldoActual()) < retiro) {
            cuenta1.setSaldoActual(0);
            
//        break;
        } else {
            cuenta1.setSaldoActual(cuenta1.getSaldoActual()-retiro);
        }
    }
    

    public void consultarSaldo() {
        System.out.println("Su saldo actual es:" + cuenta1.getSaldoActual());
    }
    
    public void mostrarDatos() {
        System.out.println(cuenta1.toString());
    }

}



