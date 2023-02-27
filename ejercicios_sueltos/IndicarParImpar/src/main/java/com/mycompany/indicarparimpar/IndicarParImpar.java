package com.mycompany.indicarparimpar;

import java.util.Scanner;

public class IndicarParImpar {

    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        int num;

        System.out.println("Introduce un número para saber si es par o impar:");
        num = lectura.nextInt();

        if (num % 2 == 0) {
            System.out.println("Es un número par.");
        } else {
            System.out.println("Es un número impar.");
        }

    }

}
