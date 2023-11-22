package piza15_22;

import java.io.IOException;

public class piza18 {
	
		public static void main(String[] args) throws IOException {
			char letra;
			
			System.out.print("Pulse unha tecla Minuscula: ");
			letra = (char) System.in.read();
			
			if (letra >='a' && letra <='z') {
				System.out.print("Pulsou esta tecla: " + letra);
				System.out.print(" E MINUSCULA");
			}
				else
					System.out.print("NON PERMITIDA");
			}
		}