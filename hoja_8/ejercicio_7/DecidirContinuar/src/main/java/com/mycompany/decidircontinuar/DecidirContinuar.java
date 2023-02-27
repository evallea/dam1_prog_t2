package com.mycompany.decidircontinuar;

import java.util.Scanner;

public class DecidirContinuar {

    // EJERCICIO 7: Escribir un algoritmo que permita escribir en pantalla la frase:
    // “Esta es la ejecución del programa"
    // "¿Desea continuar? S/N”
    // Si la respuesta es S volvemos a ofrecer la ejecución del programa.
    // Si la respuesta es N salimos del programa con una despedida.
    // Si la respuesta es distinta de S o N informamos del dato inválido y se pregunta de nuevo si desea continuar.
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        String opcion = "S"; // "opcion" empieza siendo "S" para que tenga lugar el primer "if" del bucle siguiente.

        do {

            if (opcion.equalsIgnoreCase("S")) { // Si "opcion" es igual a "S", tanto en mayúsculas como en minúsculas:
                System.out.println("Esta es la ejecución del programa.");
                System.out.println("¿Desea continuar? S/N");
                opcion = lectura.next(); // Se da de nuevo valor a "opcion".
            } else { // Si "opcion" no es "S" ni "N" (porque ya hay condiciones para ambos casos), se muestra este mensaje:
                System.out.println("Ha introducido un dato no válido.");
                opcion = "S"; // Se transforma el valor de "opcion" a "S" de nuevo, para volver a repetir el primer "if".
            }

        } while (!opcion.equalsIgnoreCase("N")); // Mientras "opcion" no sea igual (!) a "N", tanto en mayúsculas como en minúsculas, el bucle se repite.

        System.out.println("Hasta la próxima...");

    }
}
