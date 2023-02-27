package com.mycompany.tablasmultiplicar1a10;

import java.util.Scanner;

public class TablasMultiplicar1a10 {

    // EJERCICIO 9: Visualizar por pantalla las tablas de multiplicar del 1 al 10.
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        int num;
        int i; // Esta variable se usará de contador en el siguiente bucle "for".

        System.out.println("Introduce un número para conocer su tabla de multiplicar:");
        num = lectura.nextInt(); // Se da valor a la variable "num".

        for (i = 1; i <= 10; i++) { // Con cada vuelta al bucle, "i" aumenta en 1 su valor, desde 1, hasta 10.
            System.out.println(num + " * " + i + " = " + num * i); // En cada vuelta, se multiplica "num" por el valor de "i", y se imprime.
        }

    }
}
