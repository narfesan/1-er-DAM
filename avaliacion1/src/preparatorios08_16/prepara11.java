package preparatorios08_16;

import java.util.Scanner;

import java.io.IOException;

public class prepara11 {
	public static void main(String[] args) throws IOException {
		char letra;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Dame DIXITO ou VOCAL minuscula: ");
		letra = (char) System.in.read();
	
		while ((letra >= '0' && letra <= '9') || (letra == 'a' || letra == 'e' || letra == 'i'|| letra == 'o'|| letra == 'u')) {
						
			if (letra >= '0' && letra <= '9') {
				System.out.println("->CORRECTO, pulsaches este DIXITO: " + letra);
			} else
				System.out.println("->CORRECTO, pulsaches esta VOCAL minuscula: " + letra);
			teclado.nextLine();
			System.out.print("Dame DIXITO ou VOCAL minuscula: ");
			letra = (char) System.in.read();
		}
		System.out.print("+++++->INCORRECTO, pulsaches esta tecla: " + letra);
		teclado.close();
	}
}
