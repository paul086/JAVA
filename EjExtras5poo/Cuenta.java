package ejextras5poo;

import java.util.Scanner;

public class Cuenta {

    private double saldo;
    private String titular;

    Scanner leer = new Scanner(System.in);

    public Cuenta() {
    }

    public void cargarCliente() {
        System.out.println("Ingrese el nombre del titular de la cuenta:");
        this.titular = leer.nextLine();
    }

    public void retirar_dinero(double retiro) {
        if (this.saldo > 0 && retiro < this.saldo) {
            this.saldo -= retiro;
            System.out.println("Su saldo en la cuenta es de " + this.saldo);
        } else {
            System.out.println("ANDÁ PA SHA! SECOOOO");
        }
    }

    public void depositar_dinero(double deposito) {
        this.saldo += deposito;
        System.out.println("Su saldo en la cuenta es de " + this.saldo);
    }
}
