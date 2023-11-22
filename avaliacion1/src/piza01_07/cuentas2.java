package piza01_07;

import java.util.Scanner;

public class cuentas2 {
    public static void main(String[] args) {
        // Definir las denominaciones de billetes y monedas
        String[] denominaciones = {
            "Billetes de 50", "Billetes de 20", "Billetes de 10", "Billetes de 5",
            "Monedas de 2", "Monedas de 1", "Monedas de 0,50", "Monedas de 0,20", "Monedas de 0,10"
        };

        // Definir los valores correspondientes a cada denominación
        float[] valores = { 50f, 20f, 10f, 5f, 2f, 1f, 0.50f, 0.20f, 0.10f };

        Scanner teclado = new Scanner(System.in);
        float total = 0;

        // Iterar a través de las denominaciones y solicitar la cantidad
        for (int i = 0; i < denominaciones.length; i++) {
            System.out.print(denominaciones[i] + ": ");
            int cantidad = teclado.nextInt();
            total = total + cantidad * valores[i];
        }

        // Imprimir el resultado
        System.out.println("====================");
        System.out.println("En TOTAL hay " + total);
        
        teclado.close();
    }
}
