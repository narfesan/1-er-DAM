package misClases.teoria;

import java.util.Scanner;

public class CPrueba {

	private CGrados grados = new CGrados();

	public void RecogerGrados() {

		float temperatura;
		Scanner teclado = new Scanner(System.in);

		System.out.print("Dame a temperatura: ");
		temperatura = teclado.nextFloat();
		
		grados.CentrigadosAsignar(temperatura); 
		
		teclado.close();

	}
	
	public void AmosarGrados() {
		System.out.println(grados.CentigradosObtener() + " C " + grados.FahrenheitObtener() + " F " );
	}
}