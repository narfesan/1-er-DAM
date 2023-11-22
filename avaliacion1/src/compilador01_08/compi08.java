package compilador01_08;

import java.util.Scanner;

public class compi08 {
    public static void main(String[] args) {
        int idade1, idade2, idade3, meses1, meses2, meses3;
        
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
        meses1 = (idade1 % 12);
        meses2 = (idade2 % 12);
        meses3 = (idade3 % 12);
        System.out.println("Uxia ten " + idade1 + " anos e " + meses1 +  " meses.");
        System.out.println("Maruxa ten " + idade2 + " anos e " + meses2 +  " meses.");
        System.out.println("Anxo ten " + idade3 + " anos e " + meses3 + " meses.");
        
        
      
       
        teclado.close();
    }
}
