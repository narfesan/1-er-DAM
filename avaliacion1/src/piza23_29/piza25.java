package piza23_29; // Declaración del paquete del programa

import java.util.Scanner; // Importa la clase Scanner del paquete java.util

public class piza25 { // Declaración de la clase piza25

	public static void main(String[] args) { // Declaración del método main
		int num, cont1 = 0, cont2 = 0; // Declaración de variables enteras "num", "cont1" y "cont2" inicializadas en 0
										// para contar números en dos rangos
		Scanner teclado = new Scanner(System.in); // Creación de un objeto Scanner llamado "teclado" para la entrada del
													// usuario

		System.out.print("Dame un número entre o 1 e o 100: "); // Muestra el mensaje "Dame un número entre 1 e 100" en
																// la consola
		num = teclado.nextInt(); // Lee un número ingresado por el usuario y lo almacena en la variable "num"

		while (num >= 1 && num <= 100) { // Inicia un bucle while que se ejecuta mientras "num" esté entre 1 y 100,
											// inclusive
			if (num > 1 && num < 50) { // Verifica si "num" está en el rango entre 2 y 49
				cont1 = cont1 + 1; // Si está en ese rango, incrementa el contador "cont1"
			} else {
				cont2 = cont2 + 1; // Si no está en ese rango, incrementa el contador "cont2"
			}
			System.out.print("Dame outro número: "); // Muestra el mensaje "Dame otro número" en la consola
			num = teclado.nextInt(); // Lee otro número ingresado por el usuario y lo almacena en la variable "num"
		}

		System.out.println("Entre 1 e o 50 houbo " + cont1 + " números"); // Muestra la cantidad de números en el primer
																			// rango
		System.out.println("Entre 51 e o 100 houbo " + cont2 + " números"); // Muestra la cantidad de números en el
																			// segundo rango
		teclado.close(); // Cierra el objeto Scanner
	}
}
