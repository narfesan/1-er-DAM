package piza30_35;

import java.util.Scanner;

public class piza30 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num;

		System.out.println("Dame un número entre 1 e 20: ");
		num = teclado.nextInt();

		while (num < 1 || num > 20) {
			System.out.println("Dame outro número: ");
			num = teclado.nextInt();
		}
		System.out.print("FINAL");

		teclado.close();

	}

}
