package com.mycompany.usarcast;

public class UsarCast {

    public static void main(String[] args) {

        int a, b;
        a = 4;
        b = 3;

        float c;
        c = (float) a / b; // Se usa un "cast" de "float" para no perder los decimales del resultado.

        System.out.println(c);

    }
}
