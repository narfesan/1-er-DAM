package teoria_capitulo02.ordenador;

public class CApOrdenador3 {
	public static void main(String[] args) {
		COrdenador3 MiOrdenador = new COrdenador3();
		
		MiOrdenador.EncenderOrdenador();
		MiOrdenador.Marca = "Ast";
	    MiOrdenador.Procesador = "Intel Pentium";
		MiOrdenador.Pantalla = "TFT";
		MiOrdenador.Estado();
		MiOrdenador.ApagarOrdenador();
		MiOrdenador.Estado();
	}
}