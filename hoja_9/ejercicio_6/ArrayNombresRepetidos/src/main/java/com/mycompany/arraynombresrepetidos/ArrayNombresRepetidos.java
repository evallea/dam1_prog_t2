package com.mycompany.arraynombresrepetidos;

import java.util.Arrays;

import java.util.Scanner;

public class ArrayNombresRepetidos {

    // EJERCICIO 6:
    // Diseña un programa que permita almacenar el nombre de 5 personas en un array que el usuario deberá introducir por teclado.
    // Se mostrará por pantalla cuál es el nombre repetido (si lo hay). 
    // En caso contrario deberá aparecer un mensaje diciendo que no hay nombres repetidos.
    public static void main(String[] args) {

        String[] arrayNombre = new String[5];
        Scanner lectura = new Scanner(System.in);
        int contador = 0;

        for (int i = 0; i < arrayNombre.length; i++) {

            System.out.println("Escribe un nombre (hasta 5):");
            String nombre = lectura.nextLine();
            arrayNombre[i] = nombre;

            for (int j = 0; j < i; j++) {
                if (arrayNombre[i].equalsIgnoreCase(arrayNombre[j])) {
                    contador++;
                }
            }
        }

        System.out.println("Los nombres introducidos son:");
        System.out.println(Arrays.toString(arrayNombre));

        if (contador > 0) {
            System.out.println("Has introducido " + contador + " nombre(s) repetido(s).");
        } else if (contador == 0) {
            System.out.println("No has introducido ningún nombre repetido.");
        }

    }
}
