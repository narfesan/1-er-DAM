package compilador09_16;

import java.util.Scanner;

public class compi10 {
    public static void main(String[] args) {
        
        float precio, venta, PVP;
        
        Scanner teclado = new Scanner(System.in);
             
        System.out.print("Dame precio de compra: ");
        precio = teclado.nextInt();
          
        venta = (float) (precio * 1.35);
        PVP = (float)(venta * 1.18);
       
        
        System.out.println("Precio de venta------> " + venta );
        System.out.println("PCP------------------> " + PVP );
             
        teclado.close();
    }
}
