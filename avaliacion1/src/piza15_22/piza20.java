package piza15_22;

import java.io.IOException;

public class piza20 {
	public static void main(String[] args) throws IOException {
		char letra;
		System.out.print("Presione una tecla: ");
		letra = (char) System.in.read();

		if (letra >= 'A' && letra <= 'Z' || letra >= 'a' && letra <= 'z' || letra == 'Ñ') {
			System.out.println("LETRA");
		} else if (letra >= '0' && letra <= '9') {
			System.out.println("DIGITO");
		} else {
			System.out.println("Tecla NON PERMITIDA");
		}
	}

}
