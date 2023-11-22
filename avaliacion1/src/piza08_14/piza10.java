package piza08_14;

import java.util.Scanner;

public class piza10 {
	public static void main (String[]arg) {
		Scanner teclado = new Scanner(System.in);
		int num;		
		System.out.print("Dame un número menor que 20: ");
		num = teclado.nextInt();
			
			for (int i = 20; i>= num; num++) {
				System.out.println(num);
			}
		teclado.close();
	}

}
