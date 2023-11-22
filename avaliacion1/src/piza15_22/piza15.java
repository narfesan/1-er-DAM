package piza15_22;

import java.util.Scanner;

public class piza15 {
	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numA, numB;

        System.out.print("Dame o número A: ");
        numA = teclado.nextInt();
        
        System.out.print("Dame o número B: ");
        numB = teclado.nextInt();
    
        if (numA < numB)
        	System.out.println("A e MAIOR que B");
        else if (numA > numB)
        	System.out.println("A e MENOR que B");
        else
        	System.out.println("A e IGUAL que B");
        
        teclado.close();
	}
} 