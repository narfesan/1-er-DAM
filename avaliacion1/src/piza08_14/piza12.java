package piza08_14;

import java.util.Scanner;

public class piza12 {
	public static void main(String[] args) {
		int numA, numB;
		Scanner teclado = new Scanner(System.in);

		System.out.print("Dame o n�mero A menor que B: ");
		numA = teclado.nextInt();
		System.out.print("Dame o n�mero B: ");
		numB = teclado.nextInt();

		for (; numA <= numB; numA++) {
			System.out.println(numA);
			teclado.close();
		}

		
	}

}
