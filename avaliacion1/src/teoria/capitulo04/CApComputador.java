package teoria.capitulo04;

import misClases.teoria.CComputador;

class CApComputador {

	public static void main(String[] args) {

		CComputador computador1 = new CComputador();
		CComputador computador2 = new CComputador();

		CComputador.EstablecerGarantia(3);

		computador1.modificar("Ast", "Intel Pentium", "TFT");
		computador2.modificar("HP", "AMD", "CRT");

		computador1.EncenderOrdenador();
		computador1.Estado();
		computador1.ApagarOrdenador();
		computador1.Estado();

		computador2.EncenderOrdenador();
		computador2.Estado();
		computador2.ApagarOrdenador();
		computador2.Estado();

	}

}
