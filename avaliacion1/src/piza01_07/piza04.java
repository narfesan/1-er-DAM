package piza01_07;

import java.util.Scanner;

public class piza04 {
	public static void main(String[] args) {

		int i, num;

		Scanner teclado = new Scanner(System.in);

		System.out.print("Dame un número menor que 20: ");
		num = teclado.nextInt();

		i = 20;
		while (num <= i) {
			System.out.println(i);
			i = i - 1;
		}
		teclado.close();
	}
}
