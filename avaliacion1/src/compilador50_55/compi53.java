package compilador50_55;

import java.util.Scanner;

public class compi53 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int menu;
		do {
			System.out.print("\n");
			System.out.println("MENU");
			System.out.println("=======");
			System.out.println("1 - UNHA");
			System.out.println("2 - DUAS DUAS");
			System.out.println("3 - TRES TRES TRES");

			menu = teclado.nextInt();

			switch (menu) {
			case 1:
				System.out.println("UNHA");
				break;
			case 2:
				System.out.println("DUAS DUAS");
				break;
			case 3:
				System.out.println("TRES TRES TRES");
				break;
			}
		} while (menu >= 1 && menu <= 3);

		System.out.println("FINAL");
		teclado.close();
	}

}
