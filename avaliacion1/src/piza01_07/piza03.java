package piza01_07;

import java.util.Scanner;

public class piza03 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int num;

		System.out.print("Dame un número menor que 20: ");
		num = teclado.nextInt();

		while (num <= 20) {
			System.out.println(num);
			num = num + 1;

		}
		teclado.close();
	}
}
