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
public class Guia2Ej8TrabajoPractico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("");
       for (int i=0; i<4 ; i++){
         for (int j=0; j<4 ; j++) {
             if (i > 0 && i < 3 && j > 0 && j < 3){
                 System.out.print("  ");
             }else
                 System.out.print("* ");
         } 
           System.out.println("");
       }
       
        System.out.println("");// TODO
    }
    
}
