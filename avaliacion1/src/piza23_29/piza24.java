
package piza23_29; // Declaraci�n del paquete del programa

import java.util.Scanner; // Importa la clase Scanner del paquete java.util

public class piza24 { // Declaraci�n de la clase piza24

    public static void main(String[] args) { // Declaraci�n del m�todo main
        int num, multiplo3 = 0; // Declaraci�n de variables enteras "num" y "cont" inicializada en 0 para contar m�ltiplos de 3
        Scanner teclado = new Scanner(System.in); // Creaci�n de un objeto Scanner llamado "teclado" para la entrada del usuario

        System.out.print("Dame un n�mero: "); // Muestra el mensaje "Dame un n�mero" en la consola
        num = teclado.nextInt(); // Lee un n�mero ingresado por el usuario y lo almacena en la variable "num"

        while (num >= 10 && num <= 50) { // Inicia un bucle while que se ejecuta mientras "num" est� entre 10 y 50, inclusive
            if (num % 3 == 0) { // Verifica si "num" es m�ltiplo de 3 (su residuo al dividirlo por 3 es igual a 0)
                multiplo3++; // Si es m�ltiplo de 3, incrementa el contador "cont"
            }
            System.out.print("Dame un n�mero: "); // Muestra el mensaje "Dame un n�mero" en la consola
            num = teclado.nextInt(); // Lee otro n�mero ingresado por el usuario y lo almacena en la variable "num"
        }

        System.out.print("Introduciches " + multiplo3 + " m�ltiplos de 3 entre 10 e 50"); // Muestra la cantidad de m�ltiplos de 3 ingresados
        teclado.close(); // Cierra el objeto Scanner
    }
}