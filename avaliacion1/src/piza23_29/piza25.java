package piza23_29; // Declaraci�n del paquete del programa

import java.util.Scanner; // Importa la clase Scanner del paquete java.util

public class piza25 { // Declaraci�n de la clase piza25

	public static void main(String[] args) { // Declaraci�n del m�todo main
		int num, cont1 = 0, cont2 = 0; // Declaraci�n de variables enteras "num", "cont1" y "cont2" inicializadas en 0
										// para contar n�meros en dos rangos
		Scanner teclado = new Scanner(System.in); // Creaci�n de un objeto Scanner llamado "teclado" para la entrada del
													// usuario

		System.out.print("Dame un n�mero entre o 1 e o 100: "); // Muestra el mensaje "Dame un n�mero entre 1 e 100" en
																// la consola
		num = teclado.nextInt(); // Lee un n�mero ingresado por el usuario y lo almacena en la variable "num"

		while (num >= 1 && num <= 100) { // Inicia un bucle while que se ejecuta mientras "num" est� entre 1 y 100,
											// inclusive
			if (num > 1 && num < 50) { // Verifica si "num" est� en el rango entre 2 y 49
				cont1 = cont1 + 1; // Si est� en ese rango, incrementa el contador "cont1"
			} else {
				cont2 = cont2 + 1; // Si no est� en ese rango, incrementa el contador "cont2"
			}
			System.out.print("Dame outro n�mero: "); // Muestra el mensaje "Dame otro n�mero" en la consola
			num = teclado.nextInt(); // Lee otro n�mero ingresado por el usuario y lo almacena en la variable "num"
		}

		System.out.println("Entre 1 e o 50 houbo " + cont1 + " n�meros"); // Muestra la cantidad de n�meros en el primer
																			// rango
		System.out.println("Entre 51 e o 100 houbo " + cont2 + " n�meros"); // Muestra la cantidad de n�meros en el
																			// segundo rango
		teclado.close(); // Cierra el objeto Scanner
	}
}
