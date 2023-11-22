package compilador09_16;

import java.util.Scanner;

public class compi16 {
    public static void main(String[] args) {
        
        int numero;
        
        Scanner teclado = new Scanner(System.in);
             
        System.out.print("Ingrese un valor: ");
        numero  = teclado.nextInt();
        
       if (numero >0 )
    	   System.out.print("POSITIVO");
       else
    	   if (numero <0 )
        	   System.out.print("NEGATIVO");
       
           else
            	   System.out.print("NULO");
        
        System.out.println();
             
        teclado.close();
    }
}
