package com.mycompany.mayornumarray;

public class MayorNumArray {

    public static void main(String[] args) {

        int[] numeros = {5, 7, 23, 55, 18, 31};

        int mayor = numeros[0];

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] > mayor && numeros[i] % 2 == 0) {
                mayor = numeros[i];
            }

        }

        System.out.println("El mayor par es: " + mayor);

    }
}
