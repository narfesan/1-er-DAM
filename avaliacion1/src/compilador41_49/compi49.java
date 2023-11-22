package compilador41_49;

import java.io.IOException;

public class compi49 {

	public static void main(String[] args) throws IOException {

		System.out.print(">");

		int texto;
		String parentesis = "((";

		while ((texto = System.in.read()) != '\n') {

			if (texto == ' ') {
				parentesis += '_';
			} else if (texto != '\r') {
				parentesis += (char) texto;
			}
		}
		parentesis += "))";
		System.out.print(parentesis);

	}

}
