package compilador35_40;

import misClases.avaliacion1.CSerie;
import java.util.Scanner;

public class compi37 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i;
        System.out.print("Dame un n�mero entre 1 e 20: ");
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
Descripci�n : engadir � clase CSerie o seguinte m�todo
         void amosaAta20(int i)
         Dito m�todo amosara dende un numero menor que 20, recibido
         como argumento, ata o numero 20 (con for)
         
Crear un ficheiro chamado compi37.java que te�a:
A clase aplicaci�n compi37
Espazo de traballo: proxectosPRO Proxecto: avaliacion1
Paquete: compilador35_40
Descripci�n da clase aplicaci�n compi37
        - M�todo main():
                 .crea un obxecto de tipo CSerie
                 .recolle polo teclado un n�mero menor que 20
                 .chama ao seguinte m�todo, do obxeto creado*/