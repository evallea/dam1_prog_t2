package com.mycompany.alturastring;

import java.util.Scanner;

public class AlturaString {

    // EJERCICIO 12: Realiza un programa en Java que pida la altura de una persona en metros, (lo lea como cadena), y devuelva la información convertida a centímetros.
    public static void main(String[] args) {

        // Se declaran las variables:
        String alturaCadena;
        float altura;

        // Se pide la altura por teclado:
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduce la altura de la persona en metros:");
        alturaCadena = lectura.next();

        // Se pasa la altura de String a float:
        altura = Float.parseFloat(alturaCadena);

        // Se muestra por pantalla la altura convertida a centímetros:
        System.out.println("La altura de la persona es de: " + altura * 100 + " centímetros.");

    }
}
