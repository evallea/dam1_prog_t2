package com.mycompany.superficievolumenesfera;

import java.util.Scanner;

public class SuperficieVolumenEsfera {
    // EJERCICIO 1: Calcula y muestra por pantalla la superficie y el volumen de una esfera a partir de su radio, el cual se debe poder introducir por teclado.
    // S=4*PI*r^2.        
    // V=(4*PI*r^3)/3.

    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in); // "lectura" es el objeto de la clase "Scanner".

        System.out.println("Ingrese el radio de la esfera:");

        double radio = lectura.nextDouble(); // Se añade "Double" para que lea valores de ese tipo.

        double superficie;
        double volumen;

        superficie = 4 * (Math.PI) * (Math.pow(radio, 2));
        volumen = 4 * (Math.PI) * (Math.pow(radio, 3)) / 3;

        System.out.println("La superficie de la esfera es: " + superficie);
        System.out.println("El volumen de la esfera es: " + volumen);
    }
}
