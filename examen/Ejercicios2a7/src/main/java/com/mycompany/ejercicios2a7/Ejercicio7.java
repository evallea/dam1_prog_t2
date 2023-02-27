package com.mycompany.ejercicios2a7;

import java.util.Scanner;

/**
 * Hacer un programa que permita introducir edades de personas del 1 al 90,
 * hasta que se introduzca un 0, momento en el cual se mostrará al usuario el
 * siguiente menú: • Elige una opción: 1. Mostrar cuántas edades se han
 * introducido, y cuántas personas son mayores y menores de edad. 2. Mostrar la
 * media de las edades introducidas. 3. Salir
 */

public class Ejercicio7 {

    public static void main(String[] args) {

        // Declaración de variables:
        Scanner lectura = new Scanner(System.in);
        int edad;
        int numEdades = 0;
        int sumaEdades = 0;
        int media;
        int mayorEdad = 0;
        int menorEdad = 0;

        do {

            System.out.println("Introduce una edad (0 para detener):");
            edad = lectura.nextInt();

            sumaEdades = sumaEdades + edad; // Para almacenar la suma de las edades que se introducen.
            numEdades = numEdades + 1; // Para almacenar el número de edades que se introducen.
            if (edad >= 18) {
                mayorEdad = mayorEdad + 1; // Para almacenar mayores de edad.
            } else {
                menorEdad = menorEdad + 1; // Para almacenar menores de edad.
            }

        } while (edad != 0); // Cuando se introduzca 0, se sale del bucle.

        // Para descontar el 0 utilizado al salir del bucle:
        numEdades = numEdades - 1; // Se lo descontamos a "numEdades" para que no cuente 0 como una edad más.
        menorEdad = menorEdad - 1; // Se lo descontamos a "menorEdad" para que no cuente 0 como un menor de edad más.

        media = sumaEdades / numEdades; // Calcula la media de edades introducidas.

        // Se muestra el siguiente menú:
        System.out.println("Elige una opción:");
        System.out.println("1. Mostrar cuántas edades se han introducido, y cuántas personas son mayores y menores de edad.");
        System.out.println("2. Mostrar la media de las edades introducidas.");
        System.out.println("3. Salir");

        // Se declara la variable "opcion" y se le da valor por teclado para entrar al switch:
        int opcion = lectura.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Se han introducido " + numEdades + " edades.");
                System.out.println("En las edades introducidas hay " + mayorEdad + " mayor(es) de edad" + " y " + menorEdad + " menor(es) de edad.");
                break;
            case 2:
                System.out.println("La media de las edades introducidas es: " + media);
                break;
            case 3:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Debes introducir un número del 1 al 3.");
                break;

        }

    }

}
