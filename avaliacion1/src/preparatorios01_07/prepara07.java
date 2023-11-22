package preparatorios01_07;

import misClases.avaliacion1.CSerie;

import java.util.Scanner;

public class prepara07 {
	public static void main(String[] arg) {
		Scanner teclado = new Scanner(System.in);
		int a = 7, b = 19;
		
		CSerie obxeto = new CSerie();
		obxeto.amosaA_BrestaBtres(a, b);
		teclado.close();
	}
}
