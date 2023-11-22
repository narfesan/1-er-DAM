package compilador41_49;

import java.io.IOException;

public class compi47 {

	public static void main(String[] args) throws IOException {
		System.out.print(">");

		int texto;
		int contA = 0;
		int contEsp = 0;

		while ((texto = System.in.read()) != '\n') {

			if (texto == ' ') 
				contEsp++;
			 else {

			if (texto == 'a') 
					contA++;
			}
		}
		System.out.println("Total espacios en blanco: " + contEsp);
		System.out.println("Total letra 'a': " + contA);
	}

}
