package teoria_capitulo02.ordenador;

import misClases.teoria.COrdenador;

public class CApOrdenador {

	public static void main(String[] args) {
		COrdenador MiOrdenador = new COrdenador();

		MiOrdenador.EncenderOrdenador();
		MiOrdenador.Marca = "Ast";
		MiOrdenador.Procesador = "Intel Pentium";
		MiOrdenador.Pantalla = "TFT";
		MiOrdenador.Estado();
		MiOrdenador.ApagarOrdenador();
		MiOrdenador.Estado();
		System.out.println();
		System.out.println("      TRAS LLAMAR AL METODO MODIFICA");
		System.out.println("      *******************************");
		System.out.println("=============================================");
		MiOrdenador.Modifica("Dell", "AMD", "CRT");
		MiOrdenador.Estado();
	}
}