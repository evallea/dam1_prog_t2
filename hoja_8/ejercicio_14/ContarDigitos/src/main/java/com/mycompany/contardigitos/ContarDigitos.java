package com.mycompany.contardigitos;

import java.util.Scanner;

public class ContarDigitos {

    // EJERCICIO 14: 
    // Realiza un programa que cuente el número de dígitos que tiene un número entero introducido por teclado de dos formas: 
    // Considerando el dato introducido como número o como cadena.
    public static void main(String[] args) {

        // Se declaran las variables:
        int num;
        String palabra, cadenaNum;

        // Se pide por teclado el número:
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduce un número entero, se guardará como entero:");
        num = lectura.nextInt();

        // Se pide por teclado un número entero y se guarda como String:
        System.out.println("Introduce un número entero, se guardará como String:");
        palabra = lectura.next();

        // Se convierte "num" a String (cadenaNum):
        cadenaNum = Integer.toString(num);

        // Se muestra por pantalla la longitud de las dos cadenas de carácteres.
        System.out.println("El número " + cadenaNum + " tiene: " + cadenaNum.length() + " carácteres.");
        System.out.println("El número " + palabra + " tiene: " + palabra.length() + " carácteres.");

    }
}
