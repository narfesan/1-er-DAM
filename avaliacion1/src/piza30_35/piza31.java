package piza30_35;

import java.util.Scanner;

public class piza31 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int idade;

		System.out.print("Dame unha idade: ");
		idade = teclado.nextInt();

		while (idade < 1 || idade > 7 && idade < 65 || idade > 110) {

			System.out.print("Dame outra idade: ");
			idade = teclado.nextInt();

		}

		System.out.println("FINAL");
		teclado.close();
	}
}
