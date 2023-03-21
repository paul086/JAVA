/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2;

import java.util.Scanner;

/**
 *
 * @author pablcastro
 */
public class Guia2Ej7TrabajoPractico {

    /**
     * Realizar un programa que simule el funcionamiento de un dispositivo
RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las
cadenas deben llegar con un formato fijo: tienen que ser de un máximo
de 5 caracteres de largo, el primer carácter tiene que ser X y el último
tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas,
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla
FDE, y toda secuencia distinta de FDE, que no respete el formato se
considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de
lecturas correctas e incorrectas recibidas. Para resolver el ejercicio
deberá investigar cómo se utilizan las siguientes funciones de Java
Substring(), Length(), equals()
     * @param args
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Bienvenidos al SISTEMA RS232");
        Scanner leer = new Scanner(System.in);      
        int cont = 0;
        int desc = 0;
        boolean FDE = false;
        
        do{
           
            System.out.println("Ingrese una Secuencia de 5 Caracteres ");
            String cadena = leer.next();
            int longitud = cadena.length();
        if (cadena.substring(0,1).equalsIgnoreCase("X")&& cadena.substring(4,5).equalsIgnoreCase("O")){
                    cont ++;
            }else{
                    desc ++;
            }
        if (cadena.equals("&&&&&")) {
                FDE = true;
            }    
        }while(FDE == false);
         System.out.println("Lecturas correctas" + cont);
         System.out.println("Lecturas incorrectas" + desc);
            
        }
        }
