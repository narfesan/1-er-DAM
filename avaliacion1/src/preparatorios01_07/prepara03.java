package preparatorios01_07;

import java.io.IOException;
import java.util.Scanner; //hace falta con next

public class prepara03 {
	public static void main(String[] args) throws IOException {
		char letra;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Dame CONSONANTE minuscula :");
		letra = (char) System.in.read();
		teclado.nextLine();
		while (letra >= 'b' && letra <= 'z' && letra != 'e' && letra != 'i' && letra != 'o' && letra != 'u') {
			
			System.out.println("-> Correcto; pulsaches esta CONSONANTE minuscula: " + letra);
			System.out.print("Dame CONSONANTE minuscula: ");
			letra = (char) System.in.read();
			teclado.nextLine();
		}

		System.out.println("+++++> INCORRECTO, pulsaches esta tecla:" + letra);
		teclado.close();
	}

}