package compilador35_40;

import java.util.Scanner;

import misClases.avaliacion1.CSerie;

public class compi40 {

	public static void main(String[] arg) {
		Scanner teclado = new Scanner(System.in);
		int a, b;
		System.out.print("Dame un número A maior que B entre 1 e 20: ");
		a = teclado.nextInt();
		System.out.print("Dame o número B maior que A entre 1 e 20: ");
		b = teclado.nextInt();

		CSerie obxeto = new CSerie();
		obxeto.amosaB_A(a, b);
		teclado.close();
	}
}
