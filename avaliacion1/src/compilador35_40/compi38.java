package compilador35_40;

import java.util.Scanner;

import misClases.avaliacion1.CSerie;

public class compi38 {

	public static void main(String[] arg) {
		CSerie CSerie = new CSerie();
		Scanner teclado = new Scanner(System.in);

		System.out.print("Dame un número do 1 ao 20: ");
		int num = teclado.nextInt();

		CSerie.amosaDende20(num);
		teclado.close();
	}
}
