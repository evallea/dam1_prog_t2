package com.mycompany.arrayforsustitucion;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayForSustitucion {

    // EJERCICIO 5:
    // Diseña un programa que genere un array que almacene los números enteros del 1 al 20 (ambos incluidos). 
    // El array deberá generarse con un bucle for. 
    // Después, deberá sustituirse el tercer elemento por el décimo y mostrar el resultado en pantalla.
    public static void main(String[] args) {

        int[] numeros = new int[20];
       
        
        for (int i=0; i<numeros.length; i++) {
            numeros[i] = i+1;
        }
        
        System.out.println(Arrays.toString(numeros));
        
        numeros[3] = numeros[10];
         
        System.out.println(Arrays.toString(numeros));
    }
}
