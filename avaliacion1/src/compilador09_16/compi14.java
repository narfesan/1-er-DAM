package compilador09_16;

import java.util.Scanner;

public class compi14 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.print("Dame un numero entero entre 1 y 99: ");
		int entero = teclado.nextInt();

		if ( entero < 10 ) {

			System.out.println("tiene UN digito>");
			
		}

		else {

			System.out.println("Tiene DOS digitos");
		}

		teclado.close();
	}
}