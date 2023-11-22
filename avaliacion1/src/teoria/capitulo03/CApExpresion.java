package teoria.capitulo03;

import misClases.teoria.CExpresion;

public class CApExpresion {
	public static void main(String[] args) {
		CExpresion objeto = new CExpresion();
		objeto.AsignarDatos(1, 5, 2);
		objeto.VisualizarResultado();
		objeto.AsignarDatos(3, 4, 2);
		objeto.VisualizarResultado();
		objeto.AsignarDatos(5, 3, 2);
		objeto.VisualizarResultado();

	}

}
