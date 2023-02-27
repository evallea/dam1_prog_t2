package com.mycompany.contarpositivos;

import java.util.Scanner;

public class ContarPositivos {

    // EJERCICIO 2: Contar los números positivos introducidos mediante teclado. Detener el algoritmo al leer un nº cero o negativo.
    public static void main(String[] args) {

        double num;
        double contador = 0;
        Scanner lectura = new Scanner(System.in);

        do {
            
            System.out.println("Introduce un número:");
            num = lectura.nextDouble();
            contador++;

        } while (num > 0);

        contador--;

        System.out.println("Has introducido: " + contador + " números.");
    }
}
