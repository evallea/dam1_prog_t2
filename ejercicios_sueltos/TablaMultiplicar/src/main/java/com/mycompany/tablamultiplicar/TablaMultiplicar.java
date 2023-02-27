package com.mycompany.tablamultiplicar;

import java.util.Scanner;

public class TablaMultiplicar {

    // Devuelve la tabla de multiplicar del número introducido. 
    // Debe ser un entero entre 1 y 9. 
    // La tabla mostrará los productos del número desde el 0 hasta el 10. 
    // Utiliza un for.
    
    public static void main(String[] args) {

        int num; // Se declara la variable "num".
        int i; // Se declara la variable "i" que se usará en el bucle "for" como contador.

        Scanner lectura = new Scanner(System.in); // Se crea la variable "lectura" para utilizar "Scanner".

        do {

            System.out.println("Introduce un número del 1 al 9:");

            num = lectura.nextInt(); // Se asigna un valor de tipo "int" en la variable "num".

            if (num < 1 || num > 9) { // En caso de introducir un número que no sea del 1 y el 9 se mostrará este mensaje.
                System.out.println("Debes introducir un número del 1 al 9.");
            }

        } while (num <= 1 || num > 9); // Se repetirá el bucle hasta que se introduzca un número del 1 al 9.

        for (i = 0; i <= 10; i++) { // En cada vuelta al bucle, se multiplica la variable "num" por el valor que tiene "i" en cada momento, hasta 10.
            System.out.println(num + " * " + i + " = " + num * i);
        }

    }
}
