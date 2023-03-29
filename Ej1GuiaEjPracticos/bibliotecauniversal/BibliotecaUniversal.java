/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotecauniversal;

import java.util.Scanner;
import Biblioteca.Libro;
/**
 *
 * @author pablcastro
 */
public class BibliotecaUniversal {

    /**
     * Crear una clase llamada Libro que contenga los siguientes atributos:
     * ISBN, Título, Autor, Número de páginas, y un constructor con todos los
     * atributos pasados por parámetro y un constructor vacío. Crear un método
     * para cargar un libro pidiendo los datos al usuario y luego informar
     * mediante otro método el número de ISBN, el título, el autor del libro y
     * el número de páginas.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Libro MartinFierro = new Libro();
        System.out.println("Ingrese el Codigo del Libro ISBN");
        MartinFierro.ISBN = leer.nextInt();
        leer.nextLine();
        System.out.println("Ingrese el Titulo");
        MartinFierro.Título = leer.nextLine();
        System.out.println("Ingrese el Autor");       
        MartinFierro.Autor = leer.nextLine();
        System.out.println("Ingrese el Numero de Páginas");       
        MartinFierro.NumPagina = leer.nextInt();
        System.out.println(" ");
        System.out.println(MartinFierro.toString());
    }

}
