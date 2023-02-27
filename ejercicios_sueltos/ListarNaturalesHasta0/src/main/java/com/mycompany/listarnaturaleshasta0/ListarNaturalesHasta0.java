package com.mycompany.listarnaturaleshasta0;

import java.util.Scanner;

public class ListarNaturalesHasta0 {

    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        int num;

        System.out.println("Introduce un número:");
        num = lectura.nextInt();

        if (num < 0) {
            System.out.println("Debes introducir un número positivo.");
        }

        while (num >= 0) {
            System.out.println(num);
            num = num - 1;
        }

    }

}
