package com.mycompany.superficievolumencilindro;

import java.util.Scanner;

public class SuperficieVolumenCilindro {
    // EJERCICIO 2: Calcula y muestra por pantalla la superficie y el volumen de un cilindro a partir de su radio y su altura, que se deben poder introducir por teclado.
    // S=(2*PI*radio*altura)+(2+PI*radio^2).
    // V=PI*altura*radio^2.

    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in); // "lectura" es el objeto de la clase "Scanner".

        System.out.println("Ingrese el radio del cilindro:");
        double radio = lectura.nextDouble(); // Se añade "Double" para que lea valores de ese tipo.

        System.out.println("Ingrese la altura del cilindro:");
        double altura = lectura.nextDouble(); // Se añade "Double" para que lea valores de ese tipo.

        double superficie;
        double volumen;

        superficie = (2 * (Math.PI) * radio * altura) + (2 * (Math.PI) * (Math.pow(radio, 2)));
        volumen = (Math.PI) * altura * (Math.pow(radio, 2));

        System.out.println("La superficie del cilindro es: " + superficie);
        System.out.println("El volumen del cilindro es: " + volumen);

    }
}
