package com.mycompany.sumarnumeros;

import java.util.Scanner;

public class SumarNumeros {

    // EJERCICIO 4: Calcular la suma de los "num" primeros números enteros utilizando la estructura "Para".
    public static void main(String[] args) {

        double i;
        double num;
        double suma = 0;
        Scanner lectura = new Scanner(System.in);

        System.out.println("Introduce un número:");
        num = lectura.nextDouble();

        if (num < 0) {
            System.out.println("Debes escribir un número positivo.");
        } else {
            for (i = 1; i <= num; i++) {

                suma = suma + i;
            }
            
            System.out.println("La suma de los " + num + " primeros números enteros es: " + suma);
        }

    }
}
