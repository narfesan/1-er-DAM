package compilador09_16;

import java.util.Scanner;

public class compi09 {
    public static void main(String[] args) {
        int numero1, numero2, suma, resta, multiplicacion, division1, modulo;
        float divisionfloat, mediareal;
        
        Scanner teclado = new Scanner(System.in);
             
        System.out.print("dame numero 1: ");
        numero1 = teclado.nextInt();
        System.out.print("dame numero 2): ");
        numero2 = teclado.nextInt();
               
        suma = (numero1 + numero2);
        resta = (numero1 - numero2);
        multiplicacion = (numero1 * numero2);
        division1 = (numero1 / numero2);
        modulo = (numero1 % numero2);
        divisionfloat = (numero1 / numero2);
        mediareal = ((numero1 + numero2) / 2);
        
        System.out.println("A suma e-----------> " + suma );
        System.out.println("A resta e----------> " + resta );
        System.out.println("A multiplicacion e-> " + multiplicacion );
        System.out.println("A division e-------> " + division1 );
        System.out.println("O modulo e---------> " + modulo );
        System.out.println("A division real e--> " + divisionfloat );
        System.out.println("A media real e-----> " + mediareal );
        
        
      
       
        teclado.close();
    }
}
