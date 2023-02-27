package com.mycompany.compararstrings;

import java.util.Scanner;

public class CompararStrings {
// EJERCICIO 5: Introduce por teclado dos Strings y muestra por pantalla una variable booleana que indique si son iguales o no.

    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in); // "lectura" es el objeto de la clase "Scanner".

        System.out.println("Escribe cualquier cosa:");
        String a = lectura.nextLine();

        System.out.println("Vuelve a escribir cualquier cosa:");
        String b = lectura.nextLine();

        boolean c = a.equals(b); // La variable "c" hace la comparación de "a" y "b" para determinar si es igual o no.

        if (c == true) {
            System.out.println("Has escrito dos veces lo mismo.");
        } else if (c == false) {
            System.out.println("Has escrito dos cosas distintas.");
        }
    }
}
