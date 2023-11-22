package compilador01_08;

import java.util.Scanner;

public class compi06 {
    public static void main(String[] args) {
        int idade1, idade2, idade3;
        float media;
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Idade do alumno 1: ");
        idade1 = teclado.nextInt();
        System.out.print("Idade do alumno 2: ");
        idade2 = teclado.nextInt();
        System.out.print("Idade do alumno 3: ");
        idade3 = teclado.nextInt();
        
        media = (idade1 + idade2 + idade3) / (float)3; 
        System.out.println("A media e " + media);
        
        teclado.close();
    }
}
