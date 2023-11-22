package compilador41_49;

import java.io.IOException;

public class compi46 {

	public static void main(String[] args) throws IOException {

		System.out.println(">");

		int texto;

		while ((texto = System.in.read()) != '\n') {

			if (texto == '\r') {
				continue;
			}

			int encriptado = texto - 3;
			System.out.print((char) encriptado);
		}
	}

}
