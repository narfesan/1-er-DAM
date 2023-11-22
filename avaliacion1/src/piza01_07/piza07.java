package piza01_07;

import java.util.Scanner;

public class piza07 {
	public static void main (String [] arg) {
		Scanner teclado = new Scanner(System.in);
		
		int num, resultado, cont;
		resultado = 0;
		cont= 1;
		System.out.print("Dame un número del 1 al 10: ");
		num = teclado.nextInt();
		
		while (cont <=10){
			resultado= num * cont;
			System.out.println(num + " * " + cont + " = " + resultado);
			cont= cont + 1;
		}
		teclado.close();
	}

}
