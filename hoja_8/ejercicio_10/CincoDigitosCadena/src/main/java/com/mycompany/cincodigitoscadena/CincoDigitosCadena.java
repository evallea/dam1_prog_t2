package com.mycompany.cincodigitoscadena;

import java.util.Scanner;

public class CincoDigitosCadena {

    // EJERCICIO 10:
    // Diseña un programa Java que solicite un número de 5 dígitos del teclado.
    // Tratándolo como cadena, que separe el número en sus dígitos individuales y además los muestre por pantalla. 
    // Por ejemplo, si el número es 54321 que muestre:
    // Unidades = 1.
    // Decenas = 2.
    // Centenas = 3.
    // Unidades de millar = 4.
    // Decenas de millar = 5.
    public static void main(String[] args) {

        String num;
        Scanner lectura = new Scanner(System.in);

        do {
            System.out.println("Introduce un número de 5 dígitos:");
            num = lectura.next();
        } while (num.length() != 5);

        System.out.println("Decenas de millar: " + num.charAt(0));
        System.out.println("Unidades de millar: " + num.charAt(1));
        System.out.println("Centenas: " + num.charAt(2));
        System.out.println("Decenas: " + num.charAt(3));
        System.out.println("Unidades: " + num.charAt(4));
    }
}
