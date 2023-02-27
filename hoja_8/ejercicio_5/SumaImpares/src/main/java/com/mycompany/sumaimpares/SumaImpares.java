package com.mycompany.sumaimpares;

import java.util.Scanner;

public class SumaImpares {

    // EJERCICIO 5: Diseñar un algoritmo para imprimir la suma de los números impares menores o iguales que "num".
    public static void main(String[] args) {

        double num;
        double i;
        double suma = 0;
        Scanner lectura = new Scanner(System.in);
        
        System.out.println("Introduce un número:");
        num = lectura.nextDouble();

        if (num < 0) {
            System.out.println("Debes escribir un número positivo.");
        } else {
            for (i = 1; i <= num; i += 2) {
                
                suma = suma + i;
            }

            System.out.println("La suma de los impares menores o iguales que " + num + " es: " + suma);
        }

    }
}
