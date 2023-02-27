package com.mycompany.primos3a9999;

public class Primos3a9999 {

    // EJERCICIO 15: Obtener los números primos entre 3 y 9999.
    public static void main(String[] args) {

        int num;
        int divisor;
        int contador;

        for (num = 3; num <= 9999; num += 1) {

            // Las siguientes variables se establecen manualmente para que con cada vuelta al bucle "for" se reinicien al valor inicial:
            divisor = 1; // Comienza en 1 porque dividir entre 0 daría error.
            contador = 0;

            do {

                if (num % divisor == 0) { // Se comprueba que el resto sea 0 al dividir "num" entre todos los números que va valiendo "divisor" en lo que dura el bucle (desde 1 hasta el mismo valor de "num").
                    contador = contador + 1; // Se suma 1 a "contador" cada vez que se da la condición, es decir, cada vez que el resto sea 0.
                }
                divisor = divisor + 1; // Independientemente de que se dé la condición o no, se suma 1 al divisor.

            } while (divisor <= num); // Cuando la variable "divisor" sea superior a "num", se termina el bucle.

            if (contador == 2) { // Cuando la variable "contador" sea exactamente 2, quiere decir que "num" solo ha podido dividirse dando un resto de 0 dos veces (entre 1 y él mismo).
                System.out.println(num + " es primo.");
            }

            // OTRA FORMA DE HACERLO:
            /* for (int i = 3; i <= 9999; i++) {

            short contador = 0;
            for (int j = 1; j <= i; j++) {

                if (i % j == 0) {
                    contador++;
                }
            }

            if (contador == 2) {
                System.out.println(i + " es primo.");
            } */
        }

    }
}
