package com.mycompany.ejercicios2a7;

import java.util.Scanner;

/**
 * Hacer un programa que, a partir de un array de dos números enteros que el
 * usuario introducirá por teclado, muestre por pantalla cuál es el mayor y cuál
 * el menor. Si son iguales, deberá aparecer el mensaje: “¡Te repites!”.
 */

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);

        // Declaración del array:
        int[] num = new int[2];

        System.out.println("Introduce un número:");
        num[0] = lectura.nextInt(); // Se guarda el primer número en la posición 0 del array "num".

        System.out.println("Introduce otro número:");
        num[1] = lectura.nextInt(); // Se guarda el segundo número en la posición 1 del array "num".

        if (num[0] > num[1]) {
            System.out.println(num[0] + " es el mayor y " + num[0] + " el menor.");
        } else if (num[1] > num[0]) {
            System.out.println(num[1] + " es el mayor y " + num[0] + " el menor.");
        } else {
            System.out.println("¡Te repites!");
        }

    }
}
