package com.mycompany.volumencubo;

import java.util.Scanner;

public class VolumenCubo {

    public static void main(String[] args) {

        // Calcula el volumen de un cubo mediante la fórmula: "lado*lado*lado".
        double volumen;
        double lado;

        Scanner lectura = new Scanner(System.in);

        System.out.println("Introduce el valor de uno de los lados del cubo:");
        lado = lectura.nextDouble(); // Se añade "Int" para que lea valores de este tipo.

        if (lado <= 0) {
            System.out.println("Debes introducir un número mayor que cero.");
        } else {

            volumen = lado * lado * lado;

            System.out.println("El volumen del cubo es: " + volumen + " unidades al cubo.");
        }
    }
}
