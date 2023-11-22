package piza23_29; // Declaración del paquete del programa

import java.util.Scanner; // Importa la clase Scanner del paquete java.util

public class piza26 { // Declaración de la clase piza26

    public static void main(String[] args) { // Declaración del método main
        int i, j; // Declaración de variables enteras "i" y "j"
        Scanner teclado = new Scanner(System.in); // Creación de un objeto Scanner llamado "teclado" para la entrada del usuario
        i = 1; // Inicialización de "i" con el valor 1

        while (i <= 10) { // Inicia un bucle while que se ejecuta mientras "i" sea menor o igual a 10
            System.out.println("Tabla de multiplicar del " + i); // Muestra el encabezado de la tabla de multiplicar para el número "i"
            j = 1; // Inicialización de "j" con el valor 1

            while (j <= 10) { // Inicia un bucle while anidado que se ejecuta mientras "j" sea menor o igual a 10
                System.out.println(i + " X " + j + " = " + i * j); // Muestra una línea de la tabla de multiplicar
                j = j + 1; // Incrementa "j" en 1 para avanzar a la siguiente multiplicación
            }

            i = i + 1; // Incrementa "i" en 1 para avanzar a la siguiente tabla de multiplicar
            teclado.nextLine(); // Espera una entrada del usuario antes de continuar con la siguiente tabla
        }

        teclado.close(); // Cierra el objeto Scanner
    }
}
