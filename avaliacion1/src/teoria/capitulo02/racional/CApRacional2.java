package teoria.capitulo02.racional;

public class CApRacional2 {
	int Numerador;
	int Denominador;

	void AsignarDatos(int num, int den) {
		Numerador = num;
		if (den == 0)
			den = 1;
		Denominador = den;
	}

	void VisualizarRacional() {
		System.out.print("Racional-2: " + Numerador + "/" + Denominador);
	}

	public static void main(String[] args) {
		CApRacional2 rl = new CApRacional2();

		rl.AsignarDatos(2, 5);
		rl.VisualizarRacional();
	}
}
