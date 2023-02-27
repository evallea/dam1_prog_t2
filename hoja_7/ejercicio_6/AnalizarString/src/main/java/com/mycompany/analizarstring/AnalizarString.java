package com.mycompany.analizarstring;

import java.util.Scanner;

public class AnalizarString {
// EJERCICIO 6: Introduce un String de cinco carácteres por teclado y muestra por pantalla su longitud y segundo carácter.

    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        String palabra;
        
        do {
            System.out.println("Escribe una palabra:");
            palabra = lectura.next(); // En caso de querer analizar una frase en lugar de solo la primera palabra, habría que poner "nextLine()" en lugar de solamente "next()".
        } while (palabra.length() != 5);
        
        // Muestra el número de letras de la palabra introducida:
        System.out.println(palabra + " contiene " + palabra.length() + " letras.");

        // Muestra la posición del carácter número 2 de la palabra introducida:
        System.out.println("El segundo carácter de la palabra " + palabra + " es... " + "'" + palabra.charAt(1) + "'"); // Se escribe 1 para obtener el segundo carácter porque se empiezan a contar desde 0.
    }
}
