package compilador01_08;

import java.util.Scanner;

public class compi05 {
	
	public static void main(String[] ar) {
		int i;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("\nDame un numero do 1 ao 10: ");
		i = teclado.nextInt();
		System.out.println("==========");
		System.out.println(i + "x 1 = " + i * 1);
		System.out.println(i + "x 2 = " + i * 2);
		System.out.println(i + "x 3 = " + i * 3);
		System.out.println(i + "x 4 = " + i * 4);
		System.out.println(i + "x 5 = " + i * 5);
		System.out.println(i + "x 6 = " + i * 6);
		System.out.println(i + "x 7 = " + i * 7);
		System.out.println(i + "x 8 = " + i * 8);
		System.out.println(i + "x 9 = " + i * 9);
		System.out.println(i + "x 10 = " + i * 10);
		teclado.close();
		
		}
	}
