package Ejercicio1;

public class Persona {

    String nombre = "Enrique";
    String primerApellido = "Valle";
    String segundoApellido = "Alcega";
    String ciudad = "Santander";
    int numPortal = 33;
    int numPiso = 3;
    char letraPiso = 'B';

    public void muestraDatos() { // Identificador de acceso + retorno sin valor + nombre del método.

        System.out.println(nombre);
        System.out.println(primerApellido);
        System.out.println(segundoApellido);
        System.out.println(ciudad);
        System.out.println(numPortal);
        System.out.println(numPiso);
        System.out.println(letraPiso);

    }

    public int muestraDistancia(int distancia) { // Entre los paréntesis se indica que debe introducirse un parámetro distancia de tipo "int" para que funcione el método.
        
        return distancia;

    }

}
