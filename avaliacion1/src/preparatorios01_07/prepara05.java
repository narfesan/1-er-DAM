package preparatorios01_07;

import java.util.Scanner;

public class prepara05 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int idade, cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0;

		System.out.print("Dame IDADE: ");
		idade = teclado.nextInt();

		while (idade >= 3 && idade <= 17 || idade >= 25 && idade <= 65) {
			System.out.print("CORRECTO. Idade pulsada: " + idade);

			if (idade >= 3 && idade <= 17) {

				cont1++;
				if (idade >= 9 && idade <= 12) {
					System.out.println(" -> modificado este intervalo: (3,17)(9,12)");
					cont2++;
				} else {
					System.out.println(" -> modificado este intervalo: (3,17)");
				}
			} else {
				cont3++;
				if (idade >= 35 && idade <= 40) {
					System.out.println("-> modificado este intervalo: (25,65)(35,40)");
					cont4++;

				} else {

					System.out.println(" -> modificado este intervalo: (25,65)");
				}
			}
			System.out.print("Dame IDADE: ");
			idade = teclado.nextInt();
		}

		System.out.println("+++++> Entre 3 e 17 pulsaronse " + cont1 + " idades");
		System.out.println("+++++> Entre 9 e 12 pulsaronse " + cont2 + " idades");
		System.out.println("+++++> Entre 25 e 65 pulsaronse " + cont3 + " idades");
		System.out.println("+++++> Entre 35 e 40 pulsaronse " + cont4 + " idades");
		teclado.close();
	}
}
