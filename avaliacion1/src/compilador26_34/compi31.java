package compilador26_34;

import java.util.Scanner;

public class compi31 {
	public static void main(String[] arg) {
		Scanner teclado = new Scanner(System.in);

		int num, cont, valor, pares, impares;
		cont = 1;
		valor = 0;
		pares = 0;
		impares = 0;

		System.out.print("Cuantos números: ");
		num = teclado.nextInt();

		while (cont <= num) {
			System.out.print("Dame valor " + cont + ": ");
			valor = teclado.nextInt();

			if (valor % 2 == 0) {
				pares = pares + 1;
			} else {
				impares = impares + 1;
			}

			cont = cont + 1;
		}
		System.out.println("Cantidad de pares: " + pares);
		System.out.println("Cantidad de impares: " + impares);

		teclado.close();
	}

}
