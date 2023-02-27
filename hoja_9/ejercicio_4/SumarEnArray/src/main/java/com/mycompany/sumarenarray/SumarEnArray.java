package com.mycompany.sumarenarray;

import java.util.Arrays;

public class SumarEnArray {

    // EJERCICIO 4:
    // Crea un programa donde, a partir de un array de 10 números enteros:
    // Se sume una unidad a todos los números.
    // Se muestre por pantalla el array antes y después de la suma.
    public static void main(String[] args) {

        // Creación del array con un "for":
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {

            numeros[i] = i;
        }

        // Otra forma de crear el array:
        // int[] numeros = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        System.out.println("Vector antes de la suma: " + Arrays.toString(numeros));

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = numeros[i] + 1;
        }

        System.out.println("Vector después de la suma: " + Arrays.toString(numeros));

    }
}
