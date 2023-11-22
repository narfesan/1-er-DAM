package compilador41_49;

import java.io.IOException;

public class compi44 {

	public static void main(String[] args) throws IOException {
		int texto;
		int cont = 0;

		System.out.print(">");

		while ((texto = System.in.read()) != '\n') {
			if (texto == '\r') {
				continue;
			}

			System.out.print((char) texto);

			cont++;
			

		}
		System.out.println("");
		System.out.println("Teclas pulsadas: " + cont);

	}

}
