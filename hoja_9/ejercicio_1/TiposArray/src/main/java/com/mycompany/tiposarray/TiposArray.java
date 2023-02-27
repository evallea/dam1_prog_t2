package com.mycompany.tiposarray;

import java.util.Arrays;

public class TiposArray {

    // EJERCICIO 1: 
    // Diseña un programa donde crees un array de Strings, otro de booleanos y otro de carácteres. 
    // Todos ellos de cuatro elementos cualesquiera, y muéstralos por pantalla.
    public static void main(String[] args) {

        String[] arrayString = {"Uno", "Dos", "Tres", "Cuatro"};
        char[] arrayChar = {'a', 'b', 'c', 'd'};
        boolean[] arrayBoolean = {false, false, true, true};

        System.out.println(Arrays.toString(arrayString));
        System.out.println(Arrays.toString(arrayChar));
        System.out.println(Arrays.toString(arrayBoolean));
    }
}
