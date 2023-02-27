package com.mycompany.direccioncliente;

public class DireccionCliente {

    public static void main(String[] args) {

        final String DIRECCION = "Avenida Victoria";
        short portal = 313;
        byte alturaPiso = 9;
        char escalera = 'C';
        float mCuadrado = 455.2f;
        double valorCatastral = 35200000.87666666;
        boolean enVenta = true;

        System.out.println("Dirección: " + DIRECCION);
        System.out.println("Portal: " + portal);
        System.out.println("Altura del piso: " + alturaPiso);
        System.out.println("Escalera: " + escalera);
        System.out.println("Valor del m2: " + mCuadrado);
        System.out.println("Valor catastral del edificio: " + valorCatastral);
        System.out.println("En venta: " + enVenta);

    }
}
