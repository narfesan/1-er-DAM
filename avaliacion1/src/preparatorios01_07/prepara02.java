package preparatorios01_07;

import java.util.Scanner;

public class prepara02 {
	public static void main(String[] args) {
		int idade;
		Scanner teclado = new Scanner(System.in);

		System.out.print("Dame idade: ");
		idade = teclado.nextInt();

		while ((idade >= 1 && idade <= 9) || (idade >= 65 && idade <= 110)) {

			if (idade > 1 && idade < 9)
				System.out.println("->ESTE CATIVO TEN " + idade + " ANOS");
			else
				System.out.println("->ESTE ANCIAN TEN " + idade + " ANOS");
			//teclado.nextLine();
			System.out.print("Dame idade: ");
			idade = teclado.nextInt();
		}
		System.out.println("+++++> Idade NON permitida");
		teclado.close();
	}

}
