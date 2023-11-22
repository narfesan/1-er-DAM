package teoria_capitulo02.ordenador;

public class COrdenador1 {
	
	String Marca;
	String Procesador;
	String Pantalla;
	boolean OrdenadorEncendido; 
	
	 void EncenderOrdenador() {
		System.out.println("=============================================");
		if (OrdenadorEncendido == true)
			System.out.println("El ordenador1 se ha encendido.");
		else {
			OrdenadorEncendido = true;
			System.out.println("El ordenador1 se ha encendido.");
			System.out.println("=============================================");
		}
	}

	void Estado() {
		System.out.println("Estado del ordenador1" + "\n- Marca: " + Marca + "\n- Procesador: " + Procesador + "\n- Pantalla: "
				+ Pantalla);
		if (OrdenadorEncendido == true)
			System.out.println("El ordenador1 esta encendido.");
		else
			System.out.println("El ordenador1 esta apagado.");
	}

	public static void main(String[] args) {
		COrdenador1 MiOrdenador = new COrdenador1();
		MiOrdenador.Marca = "Ast";
		MiOrdenador.Procesador = "Intel Pentium";
		MiOrdenador.Pantalla = "TFT";
		MiOrdenador.EncenderOrdenador();
		MiOrdenador.Estado();
		
		

	}
}