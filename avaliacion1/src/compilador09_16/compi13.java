package compilador09_16;

import java.util.Scanner;

public class compi13 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.print("Ingrese primera nota: ");
		float nota1 = teclado.nextFloat();

		System.out.print("Ingrese segunda nota: ");
		float nota2 = teclado.nextFloat();
		
		System.out.print("Ingrese tercera nota: ");
		float nota3 = teclado.nextFloat();

		float media = ((nota1 + nota2 + nota3) / 3.0f );

		if ( media > 7 ) {

			System.out.println("Su media --->" + media);
			System.out.println("PROMOCIONADO");
		}

		else {

			System.out.println("Su media --->" + media);
		}

		teclado.close();
	}
}
