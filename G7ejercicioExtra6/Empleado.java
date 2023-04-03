package ejextras6poo;

import java.util.Scanner;

public class Empleado {

    private String nombre;
    private int edad;
    private double salario;

    Scanner leer = new Scanner(System.in);
    
    public Empleado() {
    }

    public void crearEmpleado() {
        System.out.println("Ingrese el nombre del empleado:");
        this.nombre = leer.nextLine();
        System.out.println("Ingrese la edad:");
        this.edad = leer.nextInt();
        System.out.println("Ingrese el salario actual:");
        this.salario = leer.nextDouble();
    }

    public void calcular_aumento() {
        if (this.edad > 30) {
            System.out.println("El aumento es " + (this.salario * 0.1));
            this.salario = this.salario * 1.10;
            System.out.println("El salario actual es " + this.salario);
        } else {
            System.out.println("El aumento es " + (this.salario * 0.05));
            this.salario = this.salario * 1.05;
            System.out.println("El salario actual es " + this.salario);
        }

    }

}
