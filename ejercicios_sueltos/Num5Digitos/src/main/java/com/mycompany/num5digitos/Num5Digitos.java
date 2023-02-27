package com.mycompany.num5digitos;

import java.util.Scanner;

public class Num5Digitos {
    
    // ESTE EJERCICIO ES UNA ALTERNATIVA AL EJERCICIO 10 DE LA HOJA 8.
    // Diseña un programa Java que solicite un número de 5 dígitos del teclado.
    // Tratándolo como cadena, que separe el número en sus dígitos individuales y además los muestre por pantalla. 
    // Por ejemplo, si el número es 54321 que muestre:
    // Unidades = 1.
    // Decenas = 2.
    // Centenas = 3.
    // Unidades de millar = 4.
    // Decenas de millar = 5.
    public static void main(String[] args) {

        int num;
        int numLong; // Esta variable almacenará posteriormente el número de carácteres de "num" cuando sea un String.
        Scanner lectura = new Scanner(System.in);
        String cadena = ""; // Inicialmente se declara como vacía, después se le dará el valor de "num" en forma de String.

        do {

            System.out.println("Introduce un número de 5 dígitos:");
            num = lectura.nextInt();

            cadena = String.valueOf(num); // Le da el valor de "num" a la variable "cadena", en forma de String.
            numLong = cadena.length(); // Ahora que "cadena" tiene un valor, se da a "numLong" el valor del número de carácteres de la variable "cadena".

        } while (numLong != 5); // El bucle, y por tanto la pregunta de introducir un número, se repetirá mientras "num" tenga una cantidad distinta a 5 digitos.

        // Una vez introducido un número de 5 digitos, se muestran por pantalla los siguientes mensajes de resultado, según la ubicación del carácter: 
        System.out.println("Decenas de millar: " + cadena.charAt(0));
        System.out.println("Unidades de millar: " + cadena.charAt(1));
        System.out.println("Centenas: " + cadena.charAt(2));
        System.out.println("Decenas: " + cadena.charAt(3));
        System.out.println("Unidades: " + cadena.charAt(4));

    }
}
