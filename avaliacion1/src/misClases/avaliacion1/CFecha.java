package misClases.avaliacion1;

import java.util.Scanner;

public class CFecha {

	private int dia, mes, ano;

	public void recolleDia() {

		Scanner teclado = new Scanner(System.in);

		System.out.print("Dame un dia: ");
		dia = teclado.nextInt();

		while (dia < 1 || dia > 31) {
			System.out.print("Dame un dia: ");
			dia = teclado.nextInt();

		}

	}

	public void recolleMes() {

		Scanner teclado = new Scanner(System.in);

		System.out.print("Dame un mes: ");
		mes = teclado.nextInt();

		while (mes < 1 || mes > 12) {
			System.out.print("Dame un mes: ");
			mes = teclado.nextInt();
		}
	}

	public void recolleAno() {

		Scanner teclado = new Scanner(System.in);

		System.out.print("Dame un ano: ");
		ano = teclado.nextInt();

		while (ano < 1990 || ano > 2010) {
			System.out.print("Dame un ano: ");
			ano = teclado.nextInt();
		}
	}

	public void amosaResultado() {

		recolleDia();
		recolleMes();
		recolleAno();

		System.out.print("Resultado: ");

		if (dia < 10) {
			System.out.print("0" + dia + "/");

		} else {
			System.out.print(dia + "/");
		}

		if (mes < 10) {
			System.out.print("0" + mes + "/");

		} else {
			System.out.print(mes + "/");
		}
		if (ano < 2000) {
			ano = ano - 1900;
			System.out.print(ano + "");

		} else {
			ano = ano - 2000;
			if (ano < 10) {
				System.out.print("0" + ano + "");
			} else {
				System.out.print("10");
			}
		}

	}
}
