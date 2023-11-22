package preparatorios08_16;

import java.util.Scanner;

public class prepara08 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int edad, cont1 = 0, cont2 = 0, cont3 = 0;
		System.out.print("Dame edad: ");
		edad = teclado.nextInt();
		while (edad >= 25 && edad <= 60) {
			System.out.print("CORRECTO edad pulsada: " + edad + " -> modificado este intervalo: ");
			if (edad >= 25 && edad < 30) {
				cont1++;
				System.out.print("(25,35)");
			}
			else if (edad >= 30 && edad < 35) {
				cont1++;
				cont2++;
				System.out.print("(25,35)(30,45)");
			}
			else if (edad > 35 && edad < 40) {
				cont2++;
				System.out.print("(30,45)");
			}
			else if (edad >= 40 && edad < 45) {
				cont2++;
				cont3++;
				System.out.print("(30,45)(45,60)");
			}else {
				cont3++;
			System.out.print("(40,60)");
			}
			
			//teclado.nextLine();
			System.out.print("\nDame edad: ");
			edad = teclado.nextInt();
		}
		System.out.println("+++++> Entre 25 e 35 pulsaronse " + cont1 + " idades");
		System.out.println("+++++> Entre 30 e 45 pulsaronse " + cont2 + " idades");
		System.out.println("+++++> Entre 40 e 60 pulsaronse " + cont3 + " idades");

		teclado.close();

	}
}
/*
package preparatorios07_16;

import java.util.Scanner;

public class prepara08 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int edad, cont1 = 0, cont2 = 0, cont3 = 0;
		System.out.print("Dame edad: ");
		edad = teclado.nextInt();
		while (edad >= 25 && edad <= 60) {
			System.out.print("CORRECTO edad pulsada: " + edad + " -> modificado este intervalo: ");
			if (edad >= 25 && edad <= 35) {
				cont1++;
				System.out.print("(25,35)");
			}
			if (edad >= 30 && edad <= 45) {
				cont2++;
				System.out.print("(30,45)");
			}
			if (edad >= 40 && edad <= 60) {
				cont3++;
				System.out.print("(40,60)");
			}
			teclado.nextLine();
			System.out.print("\nDame edad: ");
			edad = teclado.nextInt();
		}
		System.out.println("+++++> Entre 25 e 35 pulsaronse " + cont1 + " idades");
		System.out.println("+++++> Entre 30 e 45 pulsaronse " + cont2 + " idades");
		System.out.println("+++++> Entre 40 e 60 pulsaronse " + cont3 + " idades");

		teclado.close();

	}
}

*/