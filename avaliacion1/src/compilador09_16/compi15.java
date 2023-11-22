package compilador09_16;

import java.util.Scanner;

public class compi15 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Dame primer valor: ");
		int valor1 = teclado.nextInt();
		System.out.print("Dame segundo valor: ");
		int valor2 = teclado.nextInt();
		System.out.print("Dame tercer valor: ");
		int valor3 = teclado.nextInt();

		if ( valor1 > valor2 ) {

			System.out.println("EL MAYOR ---> " + valor1);
			
		}

		else {
		
			if ( valor2 > valor3 ) {

				System.out.println("EL MAYOR ---> " + valor2);
		}
		
			else {

					System.out.println("EL MAYOR ---> " + valor3);
			}

		teclado.close();
	}
}}
