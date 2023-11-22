package preparatorios08_16;

import java.util.Scanner;

public class prepara13 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, idade;
		System.out.print("Dame unha idade: ");
		idade = teclado.nextInt();

		while (idade >= 10 && idade <= 50) {

			System.out.print("CORRECTO, edad pulsada: " + idade);
			if (idade >= 10 && idade < 15) {
				System.out.print(" -> modificado este intervalo: (10,30)");
				cont1++;
			} else if (idade >= 15 && idade <= 21) {
				System.out.print(" -> modificados estos intervalos: (10,30)(15,21)");
				cont1++;
				cont2++;
			} else if (idade > 21 && idade < 25) {
				System.out.print(" -> modificado este intervalo: (10,30)");
				cont1++;
			} else if (idade >= 25 && idade < 30) {
				System.out.print(" -> modificado estos intervalos: (10,30)(25,45)");
				cont1++;
				cont3++;
			} else if (idade == 30) {
				System.out.print(" -> modificado estos intervalos: (10,30)(25,45)(30,50)");
				cont1++;
				cont3++;
				cont4++;

			} else if (idade > 30 && idade <= 45) {
				System.out.print(" -> modificado estos intervalos: (25,45)(30,50)");
				cont3++;
				cont4++;
			} else {
				System.out.print(" -> modificado este intervalo: (30,50)");

				cont4++;
			}
			teclado.nextLine();
			System.out.print("\nDame unha idade: ");
			idade = teclado.nextInt();
		}
		System.out.println("Entre 10 e 30 pulsáronse " + cont1 + " idades");
		System.out.println("Entre 30 e 50 pulsáronse " + cont4 + " idades");
		System.out.println("Entre 15 e 21 pulsáronse " + cont2 + " idades");
		System.out.println("Entre 25 e 45 pulsáronse " + cont3 + " idades");
		teclado.close();

	}

}
