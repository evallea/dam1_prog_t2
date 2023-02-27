package com.mycompany.primerejercicio;

public class PrimerEjercicio {

    public static void main(String[] args) {

        System.out.println("Hola mundo.");

        // Ejemplos de declaración de variables:
        int a = 5;
        double b = 5.5;
        String c = "Variable de tipo texto.";
        boolean d = true;

        // Atajo: sout + TAB.
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        // Ejemplos de operaciones:
        System.out.println("La suma de " + a + " + " + b + " es " + (a + b));
        System.out.println("La resta de " + a + " - " + b + " es " + (a - b));
        System.out.println("La multipllicación de " + a + " * " + b + " es " + (a * b));
        System.out.println("La división de " + a + " / " + b + " es " + (a / b));
        System.out.println("El resto de la división de " + a + " / " + b + " es " + (a % b));

        // Área y perímetro de un rectángulo dados sus dos lados:
        int lado1 = 4;
        int lado2 = 3;

        int area = lado1 * lado2;
        int perimetro = (lado1 * 2) + (lado2 * 2);

        System.out.println("El área del rectángulo es de: " + area + "\nEl perímetro del rectángulo es de: " + perimetro);

    }
}
