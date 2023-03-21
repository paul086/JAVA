/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * Crea una aplicación que a través de una función nos convierta una
cantidad de euros introducida por teclado a otra moneda, estas pueden
ser a dólares, yenes o libras. La función tendrá como parámetros, la
cantidad de euros y la moneda a convertir que será una cadena, este no
devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
i. * 0.86 libras es un 1 €
ii. * 1.28611 $ es un 1 €
iii. * 129.852 yenes es un 1 €
 * 
 * 
 * 
 * @author pablcastro
 */
public class Guia3TP3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        double Euro;
        System.out.println("Ingrese la Cantidad de Euros a convertir");
        Euro = leer.nextDouble();
        String tipoMoneda;
        System.out.println("Ingrese el tipo de Cambio dolares, yenes o libras");
        tipoMoneda = leer.next();
       
        cambioMoneda(Euro,tipoMoneda);
        
    }
    


public static void cambioMoneda(double Euro, String tipoMoneda){
    double Librass = 0;
    double dolaress = 0; 
    double yeness = 0;
    String cambio;
    cambio = tipoMoneda.toLowerCase();
    switch (cambio){
        case "libras":
            Librass = Euro * 0.86;
           System.out.println("El cambio es " + Librass + " " + cambio );
            break;
        case "dolares":
            dolaress = Euro * 1.28611;
            System.out.println("El cambio es " + dolaress + " " +  cambio );
            break;
        case "yenes":
            yeness = Euro * 129.852;
            System.out.println("El cambio es " + yeness + " " + cambio );
            break;
}
}
}