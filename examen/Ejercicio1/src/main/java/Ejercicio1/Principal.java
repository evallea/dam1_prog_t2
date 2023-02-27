package Ejercicio1;

public class Principal {

    /**
     * Crea un proyecto con dos clases. Una de ellas será la clase Persona,
     * cuyos atributos serán el nombre, primer apellido, segundo apellido,
     * ciudad, número de portal y piso (enteros) y letra del piso (carácter).
     * Los métodos para implementar serán los siguientes:
     *
     * • muestraDatos(): Deberá mostrar por pantalla todos los atributos,
     * especificando qué es cada uno.
     *
     * • muestraDistancia(int distancia): Deberá devolver la distancia,
     * introducida como parámetro, que camina la persona a la semana.
     *
     * En la otra clase (la clase principal) se deberá crear un objeto y llamar
     * a los dos métodos anteriores. Para el método muestraDistancia, deberá
     * mostrarse por pantalla la distancia. Los atributos tendrán que declararse
     * con el tipo de variable que corresponda y se deberá guardar un dato en
     * cada uno de ellos.
     */
    
    public static void main(String[] args) {

        // Creación del objeto "datos" de clase "Persona":
        Persona datos = new Persona();

        // Invocación de los métodos:
        datos.muestraDatos();
        System.out.println(datos.muestraDistancia(22)); // Entre los paréntesis se establece el parámetro, en este caso 22.
    }

}
