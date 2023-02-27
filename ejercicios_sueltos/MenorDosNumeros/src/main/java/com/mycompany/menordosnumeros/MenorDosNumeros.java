package com.mycompany.menordosnumeros;

import java.util.Scanner;

public class MenorDosNumeros {

    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);

        double num1;
        double num2;

        System.out.println("Introduce un número:");
        num1 = lectura.nextDouble();

        System.out.println("Introduce otro número:");
        num2 = lectura.nextDouble();

        if (num1 == num2) {
            System.out.println("Has introducido dos números iguales.");
        } else if (num1 < num2) {
            System.out.println(num1 + " es menor que " + num2);
        } else {
            System.out.println(num2 + " es menor que " + num1);
        }
    }
}
