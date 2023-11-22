package compilador17_25;

import java.util.Scanner;

public class compi23 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float sueldo;
		float entre100y300 = 0;
		float masde300 = 0;
		float gastototal = 0;
		int emp;
		int cont = 1;
		System.out.print("Cuantos empleados hay: ");
		emp = teclado.nextInt();
		
		while (cont <= emp) {
		
			System.out.print("Ingrese sueldo " + cont + ": ");
			sueldo = teclado.nextFloat();
			gastototal = gastototal + sueldo;
			if (sueldo >= 100 && sueldo <= 300) 
				entre100y300 = entre100y300 + 1;
			 else if (sueldo > 300) 
				masde300 = masde300 + 1;
			
			cont = cont + 1;
		}
		System.out.println("Empleados con sueldos entre 100 y 300: " + entre100y300);
		System.out.println("Empleados con sueldos superiores a 300: " + masde300);
		System.out.println("Gasto total de la empresa en sueldos: " + gastototal);
		teclado.close();
	}
}
