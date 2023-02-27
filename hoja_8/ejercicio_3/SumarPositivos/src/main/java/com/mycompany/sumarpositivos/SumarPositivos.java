package com.mycompany.sumarpositivos;

import java.util.Scanner;

public class SumarPositivos {

    // EJERCICIO 3: Sumar los números positivos introducidos mediante teclado. Detener el algoritmo al leer un nº cero o negativo.
    public static void main(String[] args) {

        double num;
        double suma = 0;
        Scanner lectura = new Scanner(System.in);

        do {

            System.out.println("Introduce un número:");
            num = lectura.nextDouble();

            suma = suma + num;

        } while (num > 0);
        
        suma = suma - num;

        System.out.println("La suma de los números positivos introducidos es: " + suma);
    }
}
