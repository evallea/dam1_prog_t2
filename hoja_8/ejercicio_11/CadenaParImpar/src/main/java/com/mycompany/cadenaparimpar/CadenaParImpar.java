package com.mycompany.cadenaparimpar;

import java.util.Scanner;

public class CadenaParImpar {

    // EJERCICIO 11: Realiza un programa en Java que pida un número, (lo lea como cadena), entre uno y diez y diga si es par o impar.
    public static void main(String[] args) {

        String numCadena;
        int num;
        Scanner lectura = new Scanner(System.in);

        do {
            System.out.println("Introduce un número entre 1 y 10:");
            numCadena = lectura.next();
            num = Integer.parseInt(numCadena);
        } while (num < 1 || num > 10);

        if (num % 2 == 0) {
            System.out.println(num + " es par.");
        } else {
            System.out.println(num + " es impar.");
        }

    }
}
