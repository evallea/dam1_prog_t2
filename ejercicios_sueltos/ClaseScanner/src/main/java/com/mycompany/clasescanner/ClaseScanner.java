package com.mycompany.clasescanner;

import java.util.Scanner; // Para usar la clase "Scanner" hay que importarla, siempre antes de la declaración de la clase.

public class ClaseScanner {

    public static void main(String[] args) {

        // EJEMPLOS DE CLASES DE TIPO SCANNER:
        // Para las siguientes pruebas usaremos una variable de tipo "Scanner" llamada "lectura". Siempre hay que crearla antes de esta manera:
        Scanner lectura = new Scanner(System.in);

        // .next o .nextLine
        // Se usa .next para leer una sola palabra y .nextLine para leer toda una línea.
        System.out.println("Introduce tu nombre:");
        String nombre = lectura.nextLine(); // Se crea una variable de tipo "String" llamada "nombre" con el valor que introduzcamos.
        System.out.println("Hola, " + nombre);

        // .nextByte, .nextShort, .nextInt, .nextLong, .nextFloat, .nextDouble
        System.out.println("Introduce un número:");
        double numero = lectura.nextDouble(); // Se crea una variable de tipo "double" llamada "numero" con el valor que introduzcamos.
        System.out.println("Has introducido un " + numero);

        if (numero > 10) {
            System.out.println("El número introducido es mayor que 10.");
        } else {
            System.out.println("El número introducido es menor que 10.");
        }

        // .nextBoolean
        System.out.print("¿Tienes más de 18 años? (True/False): ");

        boolean edad = lectura.nextBoolean(); // Se crea una variable de tipo "boolean" llamada "edad" con el valor "true" o "false" según nuestra elección.

        if (edad == true) {
            System.out.println("Eres mayor de edad.");
        } else if (edad == false) {
            System.out.println("Eres menor de edad.");
        }

    }
}
