package com.mycompany.invertirarraynum;

import java.util.Arrays;

public class InvertirArrayNum {

    // EJERCICIO 2: Crea un programa donde, a partir de un array de 8 números enteros, se invierta el orden de los números del array.
    public static void main(String[] args) {

        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println("VECTOR NORMAL:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println();

        System.out.println("VECTOR INVERTIDO:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }

    }
}
