package com.mycompany.clasestring;

public class ClaseString {

    public static void main(String[] args) {

        // EJEMPLOS DE CLASES DE TIPO STRING:
        // Para las siguientes pruebas usaremos una variable llamada "palabra".
        String palabra = "Programación";

        // .lenght()
        System.out.println(palabra.length()); // Hace que se muestre la longitud de carácteres de la variable "palabra".

        // .charAt();
        char a;
        a = palabra.charAt(9); // Hace que se muestre el carácter que ocupa el lugar número 9 en la variable "palabra".
        System.out.println(a);

        // .isEmpty()
        boolean b;
        b = palabra.isEmpty(); // Hace que se muestre "true" si no hay nada, o "false" en caso de que sí.
        System.out.println(b);

        // .toLowerCase()
        System.out.println(palabra.toLowerCase()); // Transforma el contenido de la variable "palabra" a minúsculas.

        // .toUpperCase()
        System.out.println(palabra.toUpperCase()); // Transforma el contenido de la variable "palabra" a mayúsculas.

        // .equals()
        String palabra2 = "Java";
        String palabra3 = "Programación";
        System.out.println(palabra2.equals(palabra)); // Compara a la variable "palabra" con "palabra2".
        System.out.println(palabra3.equals(palabra)); // Compara a la variable "palabra" con "palabra3".
    }
}
