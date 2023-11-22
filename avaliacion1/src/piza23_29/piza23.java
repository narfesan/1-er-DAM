package piza23_29; // Declaraci�n del paquete del programa

import java.util.Scanner; // Importa la clase Scanner del paquete java.util

public class piza23 { // Declaraci�n de la clase piza23

    public static void main(String[] args) { // Declaraci�n del m�todo main
        int num; // Declaraci�n de una variable entera llamada "num" para almacenar un n�mero
        Scanner teclado = new Scanner(System.in); // Creaci�n de un objeto Scanner llamado "teclado" para la entrada del usuario

        System.out.print("Dame un n�mero: "); // Muestra el mensaje "Dame un n�mero" en la consola
        num = teclado.nextInt(); // Lee un n�mero ingresado por el usuario y lo almacena en la variable "num"

        while (num >= 10 && num <= 50) { // Inicia un bucle while que se ejecuta mientras "num" est� entre 10 y 50, inclusive
            System.out.print("Dame outro n�mero: "); // Muestra el mensaje "Dame otro n�mero" en la consola
            num = teclado.nextInt(); // Lee otro n�mero ingresado por el usuario y lo almacena en la variable "num"
        }

        System.out.println("O n�mero " + num + " non est� entre o 10 e 50"); // Muestra un mensaje que indica que el n�mero no est� entre 10 y 50
        teclado.close(); // Cierra el objeto Scanner
    }
}
