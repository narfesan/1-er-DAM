package compilador09_16;

import java.util.Scanner;

public class compi12 {
	public static void main(String[] args) {

		int suma, diferencia, producto, valor1, valor2, division;

		Scanner teclado = new Scanner(System.in);

		System.out.print("Ingrese primer valor: ");
		valor1 = teclado.nextInt();

		System.out.print("Ingrese segundo valor: ");
		valor2 = teclado.nextInt();

		suma = (valor1 + valor2);
		diferencia = (valor1 - valor2);
		producto = (valor2 * valor1);
		division = (valor2 / valor1);

		if (valor1 > valor2) {

			System.out.println("La suma -------->" + suma);
			System.out.println("La diferencia -->" + diferencia);
		}

		else {

			System.out.println("El producto ---->" + producto);
			System.out.println("La division ---->" + division);
		}

		teclado.close();
	}
}
