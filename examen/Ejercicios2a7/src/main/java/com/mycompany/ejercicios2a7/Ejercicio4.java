package com.mycompany.ejercicios2a7;

import java.util.Scanner;

/**
 * Hacer un programa que solicite al usuario una cadena de caracteres y devuelva
 * el número de vocales que contiene.
 */

public class Ejercicio4 {

    public static void main(String[] args) {

        int contadorVocales = 0; // Almacena las vocales que contiene la palabra introducida.
        Scanner lectura = new Scanner(System.in);

        System.out.println("Introduce una cadena de carácteres:");
        String cadena = lectura.nextLine();

        cadena = cadena.toLowerCase(); // Se pasa la cadena a minúsculas para que el "if" posterior funcione aunque se escriban inicialmente en mayúsculas.

        for (int i = 0; i < cadena.length(); i++) {

            if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'i' || cadena.charAt(i) == 'o' || cadena.charAt(i) == 'u') {
                contadorVocales++;
            }
        }

        System.out.println("La cadena contiene un total de: " + contadorVocales + " vocales.");

    }
}
