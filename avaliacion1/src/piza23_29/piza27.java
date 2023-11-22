package piza23_29; // Declaración del paquete del programa

import java.util.Scanner; // Importa la clase Scanner del paquete java.util

public class piza27 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); // Creación de un objeto Scanner llamado "teclado" para la entrada del usuario

        for (int i = 1; i <= 10; i++) { // Inicia un bucle "for" que recorre las tablas de multiplicar del 1 al 10
            System.out.println("Taboa de multiplicar do " + i); // Muestra el encabezado de la tabla de multiplicar para el número "i"
            System.out.println("========================="); // Muestra una línea divisoria
            
            for (int j = 1; j <= 10; j++) { // Inicia un bucle "for" anidado para mostrar las multiplicaciones del número "i"
                System.out.println(i + " x " + j + " = " + i * j); // Muestra una línea con una multiplicación
            }

            teclado.nextLine(); // Espera una entrada del usuario (normalmente se usa para avanzar manualmente a la siguiente tabla)
        }

        teclado.close(); // Cierra el objeto Scanner al final del programa
    }
}
