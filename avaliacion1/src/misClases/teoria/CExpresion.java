package misClases.teoria;

public class CExpresion {

	private double c1;
	private double c2;
	private double c3;

	public void AsignarDatos(double a, double b, double c) {
		c1 = a;
		c2 = b;
		c3 = c;
	}

	public void VisualizarResultado() {
		double resultado;
		resultado = (c2 * c2 - 4 * c1 * c3) / (2 * c1);
		System.out.println(resultado);
	}
}