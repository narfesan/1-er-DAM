package piza15_22;

import java.io.IOException;

public class piza19 {
	public static void main(String[] args) throws IOException {

		System.out.print("Ingresa un car�cter: ");
		char letra = (char) System.in.read();

		if (letra >= 'A' && letra <= 'Z' || letra == '�') {
			System.out.println("MAIUSCULA " + letra);
		} else if (letra >= 'a' && letra <= 'z' || letra == '�') {
			System.out.println("MINUSCULA " + letra);
		} else if (letra >= '0' && letra <= '9') {
			System.out.println("DIGITO " + letra);
		} else {
			System.out.println("Es otro car�cter.");
		} 
	}
}