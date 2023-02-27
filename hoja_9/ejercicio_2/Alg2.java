package Hoja9;

import java.util.Arrays;

/*2. Crea un programa donde, a partir de un array de 8 números enteros, se
invierta el orden de los números del array.*/
public class Alg2 {

    public static void main(String[] args) {
        int[] numeros = new int[8];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i;
        }
        System.out.println(Arrays.toString(numeros));
        
        int j = 0;
        int[] numerosReverse = new int[8];
        
        for (int i = numeros.length - 1; i >= 0; i--) {              
                numerosReverse[j]=numeros[i];
            j++;
                    
        }
        System.out.println(Arrays.toString(numerosReverse));
}
}

/*
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");

        }
*/