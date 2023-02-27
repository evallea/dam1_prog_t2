package com.mycompany.calcularconradio;

import java.util.Scanner;

public class CalcularConRadio {

    // EJERCICIO 6:
    // Introducir el valor de un radio y ofrecer un menú para: 
    // Calcular y visualizar la longitud de la circunferencia, la superficie del círculo, el volumen de la esfera o salir. 
    // No permitir valores negativos o cero para el radio. 
    // Hacer que el programa anterior sea repetitivo, volviendo a ofrecer el menú para el mismo radio.
    public static void main(String[] args) {

        int operacion; // Esta variable se usará para formar el switch.
        double radio; // El valor de esta variable lo pediremos por teclado posteriormente para considerarlo al realizar las operaciones.
        boolean salir = false; // Esta variable determinará cuándo finaliza el programa en el momento en que se vuelva verdadera.
        Scanner lectura = new Scanner(System.in); // Esta variable se usará para poder hacer introducciones por teclado.

        do {

            System.out.println("Introduce un valor para el radio:");

            radio = lectura.nextDouble(); // El valor introducido aquí se usará como radio en la operación que se seleccione a continuación.
            if (radio <= 0) { // Si introducimos un número menor o igual a cero para el radio, mostrará este mensaje de error:
                System.out.println("Debes introducir un número mayor que cero.");
            }

        } while (radio <= 0); // Mientras no introduzcamos un número mayor que cero, se repetirá la propuesta de introducirlo.

        // Se declaran las siguientes variables para almacenar el resultado de las fórmulas con el radio introducido:
        double longCirculo = 2 * Math.PI * radio;
        double supCirculo = Math.PI * Math.pow(radio, 2);
        double volEsfera = 4.0 / 3.0 * Math.PI * Math.pow(radio, 3); // Es necesario ponerle los ceros decimales a la fracción de la fórmula para que dé el resultado correcto.

        do {

            System.out.println("SELECCIONA UNA OPCIÓN:");
            System.out.println("1. Longitud de la circunferencia");
            System.out.println("2. Superficie del círculo");
            System.out.println("3. Volumen de la esfera");
            System.out.println("4. Salir");

            operacion = lectura.nextInt(); // Según el valor que se introduzca aquí, realizará una operación u otra:

            switch (operacion) {
                case 1:
                    System.out.println("La longitud de la circunferencia es: " + longCirculo);
                    break;

                case 2:
                    System.out.println("La superficie del círculo es: " + supCirculo);
                    break;

                case 3:
                    System.out.println("El volumen de la esfera es: " + volEsfera);
                    break;

                case 4:
                    salir = true; // Si se selecciona esta opción (4), la variable "salir" se vuelve verdadera, y el programa finaliza.
                    break;

                default:
                    System.out.println("Debes introducir un número del 1 al 4 para seleccionar una opción.");
                    break;
            }

        } while (salir == false); // Mientras la variable "salir" sea falsa, el programa se repetirá de nuevo.    

    }
}
