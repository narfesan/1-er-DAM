package teoria.capitulo03;

import misClases.teoria.CEcuacion;

public class CApEcuacion {
    public static void main(String[] args) {
        CEcuacion objeto = new CEcuacion();
        objeto.Ecuacion(1, -3.2, 0, 7);
        double resultado1 = objeto.ValorPara(1);
        double resultado2 = objeto.ValorPara(1.5);
        System.out.println(resultado1);
        System.out.println(resultado2);
    }
}
