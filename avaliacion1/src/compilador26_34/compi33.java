package compilador26_34;

import java.util.Scanner;

public class compi33 {
	public static void main(String[] arg) {

		Scanner teclado = new Scanner(System.in);
		{

			int cont, valor, sum;
			valor = 0;
			sum = 0;

			for (cont = 1; cont <= 6; cont = cont + 1) {

				System.out.print("Ingrese valor " + cont + ": ");
				valor = teclado.nextInt();

				if (cont > 3 && cont <= 6)
					sum = sum + valor;
			}
			System.out.print("La suma de los 3 últimos valores es " + sum);

			teclado.close();
		}
	}
}
