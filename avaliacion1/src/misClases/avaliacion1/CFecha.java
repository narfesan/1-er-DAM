package misClases.avaliacion1;

import java.util.Scanner;

public class CFecha {

	private int dia, mes, ano;

	public void recogeDia() {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame un dia: ");
		dia = teclado.nextInt();
		
		while (dia >= 1 && dia <= 31) {
			if (dia < 10) {
				System.out.print("0"+ dia + "/");
			}else {
				System.out.print(dia + "/");
			}
		}		
		
		
		teclado.close();
	}

}
