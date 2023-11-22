package compilador41_49;

import java.io.IOException;

public class compi48 {

	public static void main(String[] args) throws IOException {
		System.out.print(">");

		int texto;

		while ((texto = System.in.read()) != '\n') {

			if (texto == ' ') {
				texto = '_';
			}
			System.out.print((char) texto);

		}
	}

}
