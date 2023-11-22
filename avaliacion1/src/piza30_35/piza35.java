package piza30_35;

import java.io.IOException;
import java.util.Scanner;

public class piza35 {
	public static void main(String[] ar) throws IOException {
		char letra;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Dame VOCAL minuscula: ");
		letra = (char) System.in.read();
		teclado.nextLine();
		while (letra != 'a' && letra != 'e' && letra != 'i' && letra != 'o' && letra != 'u') {
			System.out.print("Dame VOCAL minuscula: ");
			letra = (char) System.in.read();
			teclado.nextLine();
		}
		System.out.print("FINAL");
		teclado.close();
	}
}
