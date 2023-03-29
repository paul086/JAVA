/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca;

/**
 *
 * @author pablcastro
 */
public class Libro {

    public int ISBN;
    public String Título;
    public String Autor;
    public int NumPagina;

    public Libro() {
    }

    public Libro(int ISBN, String Título, String Autor, int NumPagina) {
        this.ISBN = ISBN;
        this.Título = Título;
        this.Autor = Autor;
        this.NumPagina = NumPagina;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTítulo() {
        return Título;
    }

    public void setTítulo(String Título) {
        this.Título = Título;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getNumPagina() {
        return NumPagina;
    }

    public void setNumPagina(int NumPagina) {
        this.NumPagina = NumPagina;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", T\u00edtulo=" + Título + ", Autor=" + Autor + ", NumPagina=" + NumPagina + '}';
    }
}
