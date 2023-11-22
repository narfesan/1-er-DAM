package compilador26_34;

import java.util.Scanner;

public class compi32 {

	public static void main(String[] arg) {

		Scanner teclado = new Scanner(System.in);
		{
			int cont, mayor12;
			mayor12 = 1;

			float total, base, altura, sup;
			base = 0;
			altura = 0;
			sup = 0;
			cont = 1;

			System.out.print("TOTAL Triangulos: ");
			total = teclado.nextFloat();

			for (cont = 1; cont <= total; cont = cont + 1) {

				System.out.print("**Dame base " + cont + ": ");
				base = teclado.nextFloat();
				System.out.print("Dame altura " + cont + ": ");
				altura = teclado.nextFloat();

				sup = base * altura / 2;
				if (sup > 12)
					mayor12 = mayor12 + 1;

				System.out.println("*Superficie " + cont + ": " + sup);
			}

			System.out.println("Triangulos con superficie superior a 12 son: :" + mayor12);

		}
		teclado.close();
	}
}
