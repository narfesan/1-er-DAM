package compilador26_34;

import java.util.Scanner;

public class compi34 {

	public static void main(String[] arg) {

		Scanner teclado = new Scanner(System.in);
		{
			int valor, cont, negativo, positivo, mult5, pares;
			negativo = 0;
			positivo = 0;
			mult5 = 0;
			pares = 0;
			valor = 1;
 
			for (cont = 1; cont <= 8; cont = cont + 1) {

				System.out.print("Ingrese valor " + cont + ": ");
				valor = teclado.nextInt();

				if (valor < 0)
					negativo = negativo + 1;
				if (valor > 0)
					positivo = positivo + 1;
				if (valor % 5 == 0)
					mult5 = mult5 + 1;
				if (valor % 2 == 0)
					pares = pares + valor;
			}
			System.out.println("Cantidad de valores negativos: " + negativo);
			System.out.println("Cantidad de valores positivos: " + positivo);
			System.out.println("Suma de los multiplos de 5: " + mult5);
			System.out.println("Suma de los valores pares: " + pares);

		}
		teclado.close();
	}
}
