package compilador01_08;

import java.util.Scanner;

public class compi07 {
    public static void main(String[] args) {
        int idade1, idade2, idade3;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Idade de Uxia (en meses): ");
        idade1 = teclado.nextInt();
        System.out.print("Idade de Maruxa (en meses): ");
        idade2 = teclado.nextInt();
        System.out.print("Idade do Anxo (en meses): ");
        idade3 = teclado.nextInt();
        
        idade1 = (idade1 / 12);
        idade2 = (idade2 / 12);
        idade3 = (idade3 / 12);
        System.out.println("Os anos de Uxia son " + idade1 + " anos.");
        System.out.println("Os anos de Maruxa son " + idade2+ " anos.");
        System.out.println("Os anos de Anxo son " + idade3+ " anos.");
        
        teclado.close();
    }
}
