package teoria.capitulo02.racional;

public class CRacional1 {
	int Numerador;
	int Denominador;

	public void AsignarDatos(int num, int den) {
		Numerador = num;
		if (den == 0)
			den = 1;
		Denominador = den;
	}

	public void VisualizarRacional() {
		System.out.print("Racional-1: ");
		System.out.print(Numerador + "/" + Denominador);
	}

	public static void main(String[] args) {
		CRacional1 rl = new CRacional1();

		rl.AsignarDatos(2, 5);
		rl.VisualizarRacional();
	}
}
