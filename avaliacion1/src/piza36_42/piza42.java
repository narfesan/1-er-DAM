package piza36_42;

import misClases.avaliacion1.CNotas;

public class piza42 {
	public static void main(String[] ar) {
		CNotas calificaciones = new CNotas();
		float notaMedia;
		calificaciones.mostraNotas();
		notaMedia = calificaciones.dameNotaMedia();
		System.out.println("=================");
		System.out.println("Nota Media: " + notaMedia);
	}
}
