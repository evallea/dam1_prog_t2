package com.mycompany.array5num;

import java.util.Arrays; // Es necesario para poder usar "Arrays.toString".

import java.util.Scanner;

public class Array5Num {

    public static void main(String[] args) {
        int[] numeros = new int[5];
        Scanner lectura = new Scanner(System.in);

        for (int i = 0; i <= 4; i++) {
            System.out.println("Introduce un número:");
            numeros[i] = lectura.nextInt();

        }

        System.out.println(Arrays.toString(numeros)); // Se utiliza "Arrays.toString" para que el array se muestre de manera correcta.
    }
}
