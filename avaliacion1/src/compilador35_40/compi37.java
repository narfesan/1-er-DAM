package compilador35_40;

import misClases.avaliacion1.CSerie;
import java.util.Scanner;

public class compi37 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i;
        System.out.print("Dame un número entre 1 e 20: ");
        i = teclado.nextInt();

        CSerie obxeto = new CSerie();
        obxeto.amosaAta20(i); 
        teclado.close();
    }
}

/*No ficheiro chamado CSerie.java que ten:
A clase CSerie
Espazo de traballo: proxectosPRO Proxecto: avaliacion1
Paquete: misClases.avaliacion1
Descripción : engadir á clase CSerie o seguinte método
         void amosaAta20(int i)
         Dito método amosara dende un numero menor que 20, recibido
         como argumento, ata o numero 20 (con for)
         
Crear un ficheiro chamado compi37.java que teña:
A clase aplicación compi37
Espazo de traballo: proxectosPRO Proxecto: avaliacion1
Paquete: compilador35_40
Descripción da clase aplicación compi37
        - Método main():
                 .crea un obxecto de tipo CSerie
                 .recolle polo teclado un número menor que 20
                 .chama ao seguinte método, do obxeto creado*/