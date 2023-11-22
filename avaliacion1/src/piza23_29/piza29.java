package piza23_29; // Declaraci�n del paquete del programa

import java.util.Scanner; // Importa la clase Scanner del paquete java.util

public class piza29 {
	public static void main(String[] args) {
		int i; // Declaraci�n de una variable entera "i"
		int j; // Declaraci�n de una variable entera "j"
		Scanner teclado = new Scanner(System.in); // Creaci�n de un objeto Scanner llamado "teclado" para la entrada del
													// usuario

		for (i = 3; i <= 8; i++) { // Inicia un bucle "for" que recorre valores de "i" desde 3 hasta 8
			System.out.println("Multiplos del " + i + " entre el 20 y el 50"); // m�ltiplos de "i" en el rango de 20 a
																				// 50

			for (j = 20; j <= 50; j++) { // Inicia un bucle "for" anidado que recorre valores de "j" desde 20 hasta 50
				if (j % i == 0) { // Verifica si "j" es m�ltiplo de "i" (el residuo de la divisi�n es igual a 0)
					System.out.println(j); // Muestra el valor de "j" si es m�ltiplo de "i"
				}
			}

			teclado.nextLine(); // Espera una entrada del usuario antes de continuar con la siguiente tabla 
			
			teclado.close(); // Cierra el objeto Scanner al final del programa
		}
	}
}
