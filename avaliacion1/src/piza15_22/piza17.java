package piza15_22;

import java.util.Scanner;

public class piza17 {
	public static void main (String[]arg) {
		Scanner teclado = new Scanner(System.in);
		int num;
		System.out.print("Dame un número: ");
		num = teclado.nextInt();
		
			if (num >= 1 && num<= 10) {
				num = num*4;
				System.out.println("Entre o 1 e o 10");
				System.out.println("Numero secreto: " + num);
			}
			else if (num >= 11 && num<= 20) {
				num = num*3;
				System.out.println("Entre o 11 e o 20");
				System.out.println("Numero secreto: " + num);
			}
			else if (num >= 21 && num<= 30) {
				num = num*2;
				System.out.println("Entre o 21 e o 30");
				System.out.println("Numero secreto: " + num);
			}
			else
				System.out.println("NUMERO non permitido: " + num);	
				teclado.close();
	}
}
 