package com.mycompany.medianumeros;

import java.util.Scanner;
import java.util.Arrays;

public class MediaNumeros {

    // EJERCICIO 3:
    // Crea un programa que pregunte al usuario cuántos números quiere almacenar.
    // El usuario podrá introducir números con decimales que se almacenarán en un array.
    // El programa deberá devolver el valor medio de los números.
    public static void main(String[] args) {

        int num;
        double suma = 0;
        double media = 0;

        Scanner lectura = new Scanner(System.in);

        do {
            System.out.println("¿Cuántos números quieres almacenar? Introduce un número natural:");
            num = lectura.nextInt();
        } while (num <= 0);

        // Array de dimensión "num":
        float[] numeros = new float[num];

        // Se almacena en cada elemento del array un número introducido por teclado:
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce un número, puede contener decimales:");
            numeros[i] = lectura.nextFloat();
        }

        // Se muestra por pantalla el array:
        System.out.println("Este es el array con los números que has introducido:" + Arrays.toString(numeros));

        // Se calcula la media:
        for (int i=0; i<numeros.length; i++){
            suma=suma+numeros[i];
        }
        media=suma/numeros.length;
        
        // Se muestra por pantalla la media:
        System.out.println("La media de los números que has introducido es: " + media);
    }
}
