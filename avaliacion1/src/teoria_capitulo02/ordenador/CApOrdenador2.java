package teoria_capitulo02.ordenador;

public class CApOrdenador2 {
    String Marca;
    String Procesador;
    String Pantalla;
    boolean OrdenadorEncendido;

    void EncenderOrdenador() {
        System.out.println("=============================================");
        if (OrdenadorEncendido == true) {
            System.out.println("El ordenador2 ya est� encendido.");
        } else {
            OrdenadorEncendido = true;
            System.out.println("El ordenador2 se ha encendido.");
        }
        System.out.println("=============================================");
    }

    void ApagarOrdenador() {
        System.out.println("=============================================");
        if (OrdenadorEncendido == true) {
            OrdenadorEncendido = false;
            System.out.println("El ordenador2 se ha apagado.");
        } else {
            System.out.println("El ordenador2 ya est� apagado.");
        }
        System.out.println("=============================================");
    }

    void Estado() {
        System.out.println("Estado del ordenador2" + "\n- Marca: " + Marca + "\n- Procesador: " + Procesador
                + "\n- Pantalla: " + Pantalla);
        if (OrdenadorEncendido == true) {
            System.out.println("El ordenador2 est� encendido.");
        } else {
            System.out.println("El ordenador2 est� apagado.");
        }
    }

    public static void main(String[] args) {
        CApOrdenador2 MiOrdenador = new CApOrdenador2();

        MiOrdenador.Marca = "Ast";
        MiOrdenador.Procesador = "Intel Pentium";
        MiOrdenador.Pantalla = "TFT";
        MiOrdenador.EncenderOrdenador(); 
        MiOrdenador.Estado();
        MiOrdenador.ApagarOrdenador();
        MiOrdenador.Estado();
    }
}
