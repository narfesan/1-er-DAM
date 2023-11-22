package misClases.teoria;

public class CComputador {

	private String Marca;
	private String Procesador;
	private String Pantalla;

	private boolean OrdenadorEncendido;

	private static byte Garantia = 3;

	public void EncenderOrdenador() {

		if (OrdenadorEncendido == true) {
			System.out.println("========================================");
			System.out.println("El ordenador ya esta encendido.");
			System.out.println("========================================");
		} else {
			OrdenadorEncendido = true;
			System.out.println("========================================");
			System.out.println("El ordenador se ha encendido.");
			System.out.println("========================================");
		}
	}

	public void Estado() {
		System.out.println("Estado del ordenador: " + "\n- Marca: " + Marca + "\n- Procesador: " + Procesador + "\n- Pantalla: " + Pantalla + "\n- Garantia: " + Garantia);

		if (OrdenadorEncendido == true) {
			System.out.println("* El ordenador esta encendido.");
		} else
			System.out.println("* El ordenador esta apagado.");
	}

	public void ApagarOrdenador() {
		OrdenadorEncendido = false;
		System.out.println("========================================");
		System.out.println("El ordenador se ha apagado.");
		System.out.println("========================================");
	}

	public void modificar(String marca, String procesador, String pantalla) {
		this.Marca = marca;
		this.Procesador = procesador;
		this.Pantalla = pantalla;

	}

	public static void EstablecerGarantia(int g) {

		Garantia = (byte) g;
	}

}
