package piza15_22;

import java.util.Scanner;

public class piza16 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.print("Dame idade: ");
		int idade = teclado.nextInt();

		if (idade >= 0 && idade <= 17) {
			System.out.println("MENOR de idade con " + idade + " anos");
			System.out.println("PROHIBIDO pasar a sala de cine");
		} else if (idade >= 18 && idade <= 110) {
			System.out.println("MAIOR de idade con " + idade + " anos");
			System.out.println("PASE a sala de cine");
		} else {
			System.out.println("Ten " + idade + " non esta CONTEMPLADO");
			System.out.println("PECHEN a sala de cine");
		}
		teclado.close();
	}
}