package piza23_29; // Declaración del paquete del programa

import java.util.Scanner; // Importa la clase Scanner del paquete java.util

public class piza23 { // Declaración de la clase piza23

    public static void main(String[] args) { // Declaración del método main
        int num; // Declaración de una variable entera llamada "num" para almacenar un número
        Scanner teclado = new Scanner(System.in); // Creación de un objeto Scanner llamado "teclado" para la entrada del usuario

        System.out.print("Dame un número: "); // Muestra el mensaje "Dame un número" en la consola
        num = teclado.nextInt(); // Lee un número ingresado por el usuario y lo almacena en la variable "num"

        while (num >= 10 && num <= 50) { // Inicia un bucle while que se ejecuta mientras "num" esté entre 10 y 50, inclusive
            System.out.print("Dame outro número: "); // Muestra el mensaje "Dame otro número" en la consola
            num = teclado.nextInt(); // Lee otro número ingresado por el usuario y lo almacena en la variable "num"
        }

        System.out.println("O número " + num + " non está entre o 10 e 50"); // Muestra un mensaje que indica que el número no está entre 10 y 50
        teclado.close(); // Cierra el objeto Scanner
    }
}
