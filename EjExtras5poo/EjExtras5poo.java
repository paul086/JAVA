/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejextras5poo;

import java.util.Scanner;

/**
 *
 * @author pablcastro
 */
public class EjExtras5POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer = new Scanner(System.in);
        Cuenta cuenta1 = new Cuenta();
        cuenta1.cargarCliente();
        int opc;
        do {
            System.out.println("MENU");
            System.out.println("1 - Depositar");
            System.out.println("2 - Retirar");
            System.out.println("0 - Salir");
            opc = leer.nextInt();
            
            switch (opc) {
                case 1:
                    System.out.println("Cuanto dinero va a depositar?");
                    double deposito = leer.nextDouble();
                    cuenta1.depositar_dinero(deposito);
                    break;
                case 2:
                    System.out.println("Cuanto dinero va a retirar?");
                    double ret = leer.nextDouble();
                     cuenta1.retirar_dinero(ret);
                     break;
                case 0:
                    System.out.println("Muchas gracias, vuelva pronto");
                    
                     break;
                default :
                    System.out.println("Ingrese una opcion válida");
                    opc = leer.nextInt();
                    break;
            }

        } while (opc != 0);

    }

}

