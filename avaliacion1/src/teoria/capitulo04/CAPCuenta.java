package teoria.capitulo04;

import misClases.teoria.CCuenta;

class CApCuenta {

	public static void main(String[] args) {

		CCuenta obxeto = new CCuenta();
		
		obxeto.EstablecerTipoDeInteres(5);

		obxeto.IngresarDinero(1000000);
		System.out.println(obxeto.SaldoActual());
		
		obxeto.IngresarDinero(300000);
		System.out.println(obxeto.SaldoActual());
		
		obxeto.AbonarIntereses();
		System.out.println(obxeto.SaldoActual());

	}

}
