package piza15_22;

import java.util.Scanner;

public class piza22 {
	public static void main (String[]arg) {
		Scanner teclado = new Scanner(System.in);
		int num1, num2;
		System.out.print("Dame un número: ");
		num1 = teclado.nextInt();
		System.out.print("Dame outro número: ");
		num2 = teclado.nextInt();
		
			if (num1 < 0 && num2 < 10) {
				System.out.println("Os dous son NEGATIVOS");
			}
			else if (num1 < 0 || num2 < 10) {
				System.out.println("Un ds dous é NEGATIVOS");
			}
			else {
				System.out.println("Los dos son POSITIVOS");
			}
			
			teclado.close();
	}
}
 