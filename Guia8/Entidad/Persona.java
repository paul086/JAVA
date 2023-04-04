/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author pablcastro
 */
public class Persona {

    private String nombre;
    private int edad;
    private String DNI;

    public Persona() {
    }

    public Persona(String nombre, int edad, String DNI) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDNI() {
        return DNI;
    }

}
