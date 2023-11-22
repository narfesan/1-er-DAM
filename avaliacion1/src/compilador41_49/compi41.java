package compilador41_49;

import java.io.IOException;

public class compi41 {

	public static void main(String[] args) throws IOException {
		
		int texto;

		System.out.print(">");

		while ((texto = System.in.read()) != '\n') {
			System.out.print((char) texto);
		}
	}
}