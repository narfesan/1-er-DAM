package piza08_14;

import java.util.Scanner;

public class piza11 {
	public static void main(String[] args) {

		int num;
		Scanner teclado = new Scanner(System.in);

		System.out.print("Ingrese un valor: ");
		num = teclado.nextInt();

		for (int i = 20; i >= num; i--)
			System.out.println(i);

		teclado.close();
	}
}
