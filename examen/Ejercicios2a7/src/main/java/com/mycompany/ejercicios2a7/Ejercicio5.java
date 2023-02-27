package com.mycompany.ejercicios2a7;

import java.util.Scanner;

public class Ejercicio5 {

    /**
     * Hacer un programa que pida al usuario su nombre, apellidos y edad y
     * devuelva todo por pantalla en una misma línea. La edad deberá ser un
     * valor entero.
     */
    
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);

        // Declaración de variables:
        String nombre;
        String apellido1;
        String apellido2;
        int edad;

        // Introducción de valores:
        System.out.println("Nombre:");
        nombre = lectura.next();

        System.out.println("Primer apellido:");
        apellido1 = lectura.next();

        System.out.println("Segundo apellido:");
        apellido2 = lectura.next();

        System.out.println("Edad:");
        edad = lectura.nextInt();

        // Mensaje por pantalla:
        System.out.println("Te llamas " + nombre + " " + apellido1 + " " + apellido2 + " y tienes " + edad + " años.");

    }

}
