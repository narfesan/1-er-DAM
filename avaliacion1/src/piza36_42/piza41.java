package piza36_42;

import misClases.avaliacion1.CNotas;

public class piza41 {
	public static void main(String[] ar) {
		CNotas calificaciones = new CNotas();
		int menor;
		float notaMenor;
		calificaciones.mostraNotas();
		menor = calificaciones.dameMenor();
		notaMenor = calificaciones.dameNota(menor);
		System.out.println("\nAlumno con MENOR nota");
		System.out.println("=====================");
		System.out.println("Alumno " + (menor + 1) + ": " + notaMenor);
	}
}