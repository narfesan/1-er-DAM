package piza15_22;

import java.io.IOException;

public class piza19 {
	public static void main(String[] args) throws IOException {

		System.out.print("Ingresa un carácter: ");
		char letra = (char) System.in.read();

		if (letra >= 'A' && letra <= 'Z' || letra == 'Ñ') {
			System.out.println("MAIUSCULA " + letra);
		} else if (letra >= 'a' && letra <= 'z' || letra == 'ñ') {
			System.out.println("MINUSCULA " + letra);
		} else if (letra >= '0' && letra <= '9') {
			System.out.println("DIGITO " + letra);
		} else {
			System.out.println("Es otro carácter.");
		} 
	}
}