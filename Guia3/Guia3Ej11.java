/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author pablcastro
 */
public class Guia3Ej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String frase;
        boolean verif;
        do {            
            System.out.print("Ingrese una palabra o frase terminada en punto: ");
            frase = leer.nextLine();
            verif = frase.endsWith(".");
            if (!verif) {
                System.out.println("La frase no termina en un punto. Inténtelo de nuevo.");
            }
        } while (!verif);
        String frase2 = codificar(frase);
        System.out.println("La palabra o frase codificada es: " + frase2);
}
    public static String codificar(String entrada) {
        String frase2 = "";
        for (int i = 0; i < entrada.length(); i++) {
            char letra = entrada.charAt(i);// es para leer  cada caracter 
            switch (letra) {
                case  'a' :
                frase2 += '@';
                    break;
                case 'e':
                    frase2 += '#';
                    break;
                case 'i':
                    frase2 += '$';
                    break;
                case 'o':
                    frase2 += '%';
                    break;
                case 'u':
                    frase2 += '*';
                    break;
              case  'A' :
                frase2 += '@';
                    break;
                case 'E':
                    frase2 += '#';
                    break;
                case 'I':
                    frase2 += '$';
                    break;
                case 'O':
                    frase2 += '%';
                    break;
                case 'U':
                    frase2 += '*';
                    break;
                default:
                    frase2 += letra;
                    break;
            }
        }
        return frase2;
    }
    
        
        
        
        
    }
    

