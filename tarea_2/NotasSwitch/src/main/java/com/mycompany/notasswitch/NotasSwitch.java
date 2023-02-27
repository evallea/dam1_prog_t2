package com.mycompany.notasswitch;

import java.util.Scanner;

public class NotasSwitch {

    // Introduce una nota y devuelve un mensaje con: 
    // Sobresaliente si está entre 9 y 10.
    // Notable si está entre 7 y 8. 
    // Bien si está entre 6 y 7.
    // Suficiente si está entre 5 y 6.
    // Insuficiente si está entre 0 y 5. 
    // Utiliza un switch.
    
    public static void main(String[] args) {

        int nota; // Se declara la variable "nota".

        Scanner lectura = new Scanner(System.in); // Se crea la variable "lectura" para utilizar "Scanner".
        
        System.out.println("Introduce una nota del 1 al 10:");

        nota = lectura.nextInt(); // Se asigna un valor de tipo "int" en la variable "nota".

        switch (nota) {
            // Si se introduce 0, 1, 2, 3 o 4, se imprimirá "Insuficiente".
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Insuficiente");
                break;
            // Si se introduce 5, se imprimirá "Suficiente".
            case 5:
                System.out.println("Suficiente");
                break;
            // Si se introduce 6, se imprimirá "Bien".
            case 6:
                System.out.println("Bien");
                break;
            // Si se introduce 7 u 8, se imprimirá "Notable".
            case 7:
            case 8:
                System.out.println("Notable");
                break;
            // Si se introduce 9 o 10, se imprimirá "Sobresaliente".
            case 9:
            case 10:
                System.out.println("Sobresaliente");
                break;
            // En caso de no darse ninguna de las opciones anteriores, se mostrará el siguiente mensaje.
            default:
                System.out.println("Debes introducir una nota entre 0 y 10.");
                break;
        }
    }
}
