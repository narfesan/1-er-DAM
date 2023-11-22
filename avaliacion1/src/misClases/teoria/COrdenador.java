package misClases.teoria;

public class COrdenador {

	public String Marca;
	public String Procesador;
	public String Pantalla;
	public boolean OrdenadorEncendido;

	public void EncenderOrdenador() {
		System.out.println("=============================================");
		if (OrdenadorEncendido == true) {
			System.out.println("El ordenador ya está encendido.");
		} else {
			OrdenadorEncendido = true;
			System.out.println("El ordenador se ha encendido.");
		}
		System.out.println("=============================================");
	}

	public void ApagarOrdenador() {
		System.out.println("=============================================");
		if (OrdenadorEncendido == true) {
			OrdenadorEncendido = false;
			System.out.println("El ordenador se ha apagado.");
		} else {
			System.out.println("El ordenador ya está apagado.");
		}
		System.out.println("=============================================");
	}

	public void Estado() {
		System.out.println("Estado del ordenador" + "\n- Marca: " + Marca + "\n- Procesador: " + Procesador
				+ "\n- Pantalla: " + Pantalla);
		if (OrdenadorEncendido == true) {
			System.out.println("El ordenador está encendido.");
		} else {
			System.out.println("El ordenador está apagado.");
		}
	}

	public void Modifica(String nuevaMarca, String nuevoProcesador, String nuevaPantalla) {
		Marca = nuevaMarca;
		Procesador = nuevoProcesador;
		Pantalla = nuevaPantalla;
	}
}
