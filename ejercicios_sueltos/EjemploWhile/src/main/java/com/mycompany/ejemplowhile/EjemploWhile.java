package com.mycompany.ejemplowhile;

public class EjemploWhile {

    public static void main(String[] args) {

        // WHILE:
        int a = 1;

        while (a <= 100) {
            a = a * 2;
            System.out.println(a);
        }

        // DO-WHILE:
        int b = 1;

        do {
            b = b * 2;
            System.out.println(b);
        } while (b <= 100);
    }
}
