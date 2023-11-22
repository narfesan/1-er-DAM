package compilador35_40;

import misClases.avaliacion1.CSerie;
import java.util.Scanner;

public class compi39 {
	public static void main(String[] arg) {
		CSerie Objeto = new CSerie();
		Scanner teclado = new Scanner(System.in);

		System.out.print("Dame un número: ");
		int numA = teclado.nextInt();
		System.out.print("Dame outro número maior que o anterior: ");
		int numB = teclado.nextInt();
		Objeto.amosaA_B(numA, numB);
		teclado.close();

	}
}
