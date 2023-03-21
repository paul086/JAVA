/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2;


/**
 *
 * @author pablcastro
 */
public class Guia2EjExtra2 {

    /**
     * Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
       diferente a cada una. A continuación, realizar las instrucciones
       necesarias para que: B tome el valor de C, C tome el valor de A, A tome
       el valor de D y D tome el valor de B. Mostrar los valores iniciales y los
       valores finales de cada variable. Utilizar sólo una variable auxiliar.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int A=5, B=3, C=10, D=15;
        System.out.println("Valores Iniciales " + A + " " + B + " " + C + " " + D);
        B = C;
        C = A;
        A = D;
        D = B;
        System.out.println("Valores Finales " + A + " " + B + " " + C + " " + D);
    }
    
}
