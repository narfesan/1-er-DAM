package piza01_07;

import java.util.Scanner;
import java.text.DecimalFormat;

public class cuentas {
	public static void main(String[] args) {
		int cant50, cant20, cant10, cant5, cant2, cant1;
		float cant050, cant020, cant010, SUM;

		Scanner teclado = new Scanner(System.in);

		System.out.print("Billetes de 50: ");
		cant50 = teclado.nextInt();
		System.out.print("Billetes de 20: ");
		cant20 = teclado.nextInt();
		System.out.print("Billetes de 10: ");
		cant10 = teclado.nextInt();
		System.out.print("Billetes de 5: ");
		cant5 = teclado.nextInt();
		System.out.print("Monedas de 2: ");
		cant2 = teclado.nextInt();
		System.out.print("Monedas de 1: ");
		cant1 = teclado.nextInt();
		System.out.print("Monedas de 0,50: ");
		cant050 = teclado.nextFloat();
		System.out.print("Monedas de 0,20: ");
		cant020 = teclado.nextFloat();
		System.out.print("Monedas de 0,10: ");
		cant010 = teclado.nextFloat();

		cant50 = cant50 * 50;
		cant20 = cant20 * 20;
		cant10 = cant10 * 10;
		cant5 = cant5 * 5;
		cant2 = cant2 * 2;
		cant1 = cant1 * 1;
		cant050 = cant050 * 0.50f;
		cant020 = cant020 * 0.20f;
		cant010 = cant010 * 0.10f;
		SUM = cant50 + cant20 + cant10 + cant5 + cant2 + cant1 + cant050 + cant020 + cant010;

		// Formatear el resultado usando DecimalFormat
		DecimalFormat df = new DecimalFormat("#.##");
		String SUM_formateado = df.format(SUM);

		System.out.println("En billetes de 50 hay " + cant50);
		System.out.println("En billetes de 20 hay " + cant20);
		System.out.println("En billetes de 10 hay " + cant10);
		System.out.println("En billetes de 5 hay " + cant5);
		System.out.println("En monedas de 2 hay " + cant2);
		System.out.println("En monedas de 1 hay " + cant1);
		System.out.println("En monedas de 0,50 hay " + cant050);
		System.out.println("En monedas de 0,20 hay " + cant020);
		System.out.println("En monedas de 0,10 hay " + cant010);
		System.out.println("====================");
		System.out.println("En TOTAL hay " + SUM_formateado); // Mostrar el resultado formateado
		
		teclado.close();
	}
}
