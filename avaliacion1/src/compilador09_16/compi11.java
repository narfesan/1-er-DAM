package compilador09_16;

import java.util.Scanner;

public class compi11 {
    public static void main(String[] args) {
        
        float PVP, precio, rebajado, nuevoPVP;
        
        Scanner teclado = new Scanner(System.in);
             
        System.out.print("Dame PVP: ");
        PVP = teclado.nextInt();
          
        precio = (float)(PVP / 1.18);
        rebajado = (float)(precio * 0.75);
        nuevoPVP = (float)(rebajado * 1.18);
       
        System.out.println("Precio ----------> " + precio );
        System.out.println("Precio Rebajado--> " + rebajado );
        System.out.println("Precio PVP-------> " + nuevoPVP ); 
             
        teclado.close();
    }
}
