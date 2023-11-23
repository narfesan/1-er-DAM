package practicas1_4;

import java.io.IOException;

public class practica2 {

	public static void main(String[] args) throws IOException {
		char letra = ' ';
		int cont = 32;
		int aux = 41;
		while (cont <= 121) {
			while (cont <= aux) {
				if (cont < 100)
					System.out.print("  " + cont + " " + letra + " ");
				else
					System.out.print(" " + cont + " " + letra + " ");
				cont++;
				letra++;

			}
			System.out.print("\n");
			System.out.print("\n");
			aux = aux + 10;
		}
		while (cont <= 126) {
			System.out.print(" " + cont + " " + letra + " ");
			cont++;
			letra++;
		}
	}
}
