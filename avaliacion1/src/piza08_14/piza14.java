package piza08_14;

import java.util.Scanner;

public class piza14 {
	public static void main (String[]args) {
		Scanner teclado = new Scanner(System.in);
		int num;
		System.out.print("Dame un numero do 1 ao 10: ");
		num = teclado.nextInt();
		System.out.println("Taboa de multiplicar do " + num);
		
		for (int i = 1; i<=10; i++) 
			System.out.println(num + " x " + i + " = " + num * i);
		teclado.close();
	}

}
