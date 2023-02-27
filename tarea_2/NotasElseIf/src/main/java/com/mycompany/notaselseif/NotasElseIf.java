package com.mycompany.notaselseif;

import java.util.Scanner;

public class NotasElseIf {

    // Introduce una nota y devuelve un mensaje con: 
    // Sobresaliente si está entre 9 y 10.
    // Notable si está entre 7 y 8. 
    // Bien si está entre 6 y 7.
    // Suficiente si está entre 5 y 6.
    // Insuficiente si está entre 0 y 5. 
    // Utiliza un else-if.
    
    public static void main(String[] args) {

        double nota; // Se declara la variable "nota".

        Scanner lectura = new Scanner(System.in); // Se crea la variable "lectura" para utilizar "Scanner".
        
        System.out.println("Introduce una nota del 1 al 10:");

        nota = lectura.nextDouble(); // Se asigna un valor de tipo "double" en la variable "nota".

        if (nota >= 0 && nota < 5) {
            System.out.println("Insuficiente");
        } else if (nota >= 5 && nota < 6) {
            System.out.println("Suficiente");
        } else if (nota >= 6 && nota < 7) {
            System.out.println("Bien");
        } else if (nota >= 7 && nota < 9) { // Se indica < 9 para contar como notable también hasta "8.9".
            System.out.println("Notable");
        } else if (nota >= 9 && nota <= 10) {
            System.out.println("Sobresaliente");
        } else { // Si no se da ninguna de las anteriores condiciones, significará que el número introducido es menor que 0 o mayor que 10.
            System.out.println("Debes introducir una nota entre 0 y 10.");
        }

    }
}
