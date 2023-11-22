package compilador17_25;

import java.util.Scanner;

public class compi21 {

	public static void main(String[] args) {

		 Scanner scanner = new Scanner(System.in);

	        int contadorAprobados = 0;
	        int contadorReprobados = 0;
	        int contadorAlumnos = 0;

	        while (contadorAlumnos < 7) {
	            System.out.print("Ingrese la nota del alumno " + (contadorAlumnos + 1) + ": ");
	            int nota = scanner.nextInt();

	            if (nota >= 6) {
	                contadorAprobados = contadorAprobados + 1;
	            } else {
	                contadorReprobados = contadorReprobados + 1;
	            }

	            contadorAlumnos = contadorAlumnos + 1;
	        }

	        System.out.println("Cantidad de alumnos con nota mayor o igual a 6: " + contadorAprobados);
	        System.out.println("Cantidad de alumnos con nota menor a 6: " + contadorReprobados);

	        scanner.close();
	    }
	}
