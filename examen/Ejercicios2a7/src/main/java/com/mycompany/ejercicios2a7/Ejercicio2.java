package com.mycompany.ejercicios2a7;

import java.util.Scanner;

public class Ejercicio2 {

    /**
     * Hacer un programa, al que se le pase una palabra por teclado, que
     * transforme a mayúscula las letras impares (1ª, 3ª, 5ª…), y a minúscula
     * las pares (2ª, 4ª, 6ª…), con independencia de cómo se introduzca la
     * palabra.
     */
    
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        System.out.println("Escribe una palabra:");

        // Declaración de variables:
        String palabra = lectura.nextLine(); // Esta variable la conformará la palabra que escribamos.
        String palabraFinal = ""; // Esta variable, inicialmente vacía, se usará para ir almacenando las letras.

        for (int i = 0; i < palabra.length(); i++) {

            if (i % 2 == 0) {
                palabra = palabra.toUpperCase(); // Cambia la palabra entera a mayúsculas.
                palabraFinal = palabraFinal + palabra.charAt(i); // Selecciona solamente la letra en posición "i", transformada anteriormente.
            } else {
                palabra = palabra.toLowerCase(); // Cambia la palabra entera a minúsculas.
                palabraFinal = palabraFinal + palabra.charAt(i); // Selecciona solamente la letra en posición "i", transformada anteriormente.
            }

        }

        System.out.println(palabraFinal);

    }

}
