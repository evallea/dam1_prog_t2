package com.mycompany.ejercicios2a7;

import java.util.Scanner;

public class Ejercicio6 {

    /**
     * Hacer un programa que pida al usuario un número del 1 al 3. Utilizando la
     * estructura de control “switch”, el programa hará lo siguiente:
     * 
     * • Si el usuario introduce un 1 deberá aparecer por pantalla el mensaje: 
     * “Eres el primero”.
     * 
     * • Si el usuario introduce un 2 deberá aparecer por pantalla el mensaje: 
     * “Eres el segundo”.
     * 
     * • Si el usuario introduce un 3 deberá aparecer por pantalla el mensaje: 
     * “Eres el segundo”.
     * 
     * • Si el usuario introduce otro número el mensaje será: 
     * “Estás fuera del podio”.
     */
    
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduce un número del 1 al 3:");
        int num = lectura.nextInt(); // Selecciona un valor en el switch siguiente:

        switch (num) {
            case 1:
                System.out.println("Eres el primero.");
                break;
            case 2:
                System.out.println("Eres el segundo.");
                break;
            case 3:
                System.out.println("Eres el tercero.");
                break;
            default:
                System.out.println("Estás fuera del podio.");

        }

    }
}
