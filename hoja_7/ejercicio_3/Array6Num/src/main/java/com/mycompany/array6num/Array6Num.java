package com.mycompany.array6num;

import java.util.Arrays;

public class Array6Num {
// EJERCICIO 3: Crea un array de seis números enteros y muéstralo por pantalla.

    public static void main(String[] args) {

        int[] a = {1, 7, 5, 21, 45, 2}; // Esta línea crea un array de nombre "a" con seis números enteros.
        System.out.println(Arrays.toString(a)); // Transforma el array "a" a String para poder leerse.

        // Crea un array de nombre "b" con seis números aún no asignados.
        int[] b = new int[6]; // De este modo habría que escribir "new int".
        System.out.println(Arrays.toString(b)); // Transforma el array "b" a String para poder leerse.

        // Ahora se le asignan valores al array anterior:
        b[0] = 1;
        b[1] = 7;
        b[2] = 5;
        b[3] = 21;
        b[4] = 45;
        b[5] = 2;
        System.out.println(Arrays.toString(b));

    }
}
