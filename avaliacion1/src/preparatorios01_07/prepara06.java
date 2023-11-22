package preparatorios01_07;

import misClases.avaliacion1.CSerie;

import java.util.Scanner;

public class prepara06 {
	public static void main(String[] arg) {
		Scanner teclado = new Scanner(System.in);
		int a, b;
		a = 8;
		b = 20;

		CSerie obxeto = new CSerie();
		obxeto.amosaB_AsumaAimpares(a, b);
		teclado.close();
	}
}
