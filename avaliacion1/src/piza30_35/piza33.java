package piza30_35;

import java.io.IOException;
import java.util.Scanner;

public class piza33 {
	public static void main(String[] ar) throws IOException {
		char letra;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Dame MINUSCULA: ");
		letra = (char) System.in.read();
		teclado.nextLine();
		while (letra < 'a' || letra > 'z') {
			System.out.print("Dame MINUSCULA: ");
			letra = (char) System.in.read();
			teclado.nextLine();
		}
		System.out.print("FINAL");
		teclado.close();
	}
}
