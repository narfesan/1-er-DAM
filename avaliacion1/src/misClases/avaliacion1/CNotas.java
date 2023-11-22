package misClases.avaliacion1;

public class CNotas {
	private float[] notas = { 9.92F, 7.45F, 8.15F, 5.6F, 5.35F, 
							  9.15F, 2.45F, 4.4F, 6.7F, 1.8F };
	
//PIZA 37
	public void mostraNotas() {
		int i;
		System.out.println("Relacion de NOTAS");
		System.out.println("=================");
		for (i = 0; i < 10; i++)
			System.out.println("Alumno " + (i + 1) + ": " + notas[i]);
	}

	public float dameNota(int i) {
		return notas[i];
	}
	
//PIZA 38
	public void mostrarAprobados() {
		int i;
		System.out.println("Relacion de APROBADOS");
		System.out.println("=====================");
		for (i = 0; i < 10; i++)
			if (notas[i] >= 5)
				System.out.println("Alumno " + (i + 1) + ": " + notas[i]);
	}
	
//PIZA 39
	public void mostrarSuspensos() {
		int i;
		System.out.println("Relacion de SUSPENSOS");
		System.out.println("=====================");
		for (i = 0; i < 10; i++)
			if (notas[i] < 5)
				System.out.println("Alumno " + (i + 1) + ": " + notas[i]);

	}

//PIZA 40
	public int dameMaior() {
		int i, maior;
		float notaMaior;
		maior = 0;
		notaMaior = notas[0];
		for (i = 0; i < 10; i++)
			if (notas[i] > notaMaior) {
				maior = i;
				notaMaior = notas[i];
			}
		return maior;
	}

//PIZA 41
	public int dameMenor() {
		int i, menor;
		float notaMenor;
		menor = 0;
		notaMenor = notas[0];
		for (i = 1; i < 10; i++)
			if (notas[i] < notaMenor) {
				menor = i;
				notaMenor = notas[i];
			}
		return menor;
	}

//PIZA 42

	public float dameNotaMedia() {
		int i;
		float notaMedia;
		notaMedia = 0;
		for (i = 0; i < 10; i++)
			notaMedia = notaMedia + notas[i];
		notaMedia = notaMedia / 10;
		return notaMedia;
	}

}
