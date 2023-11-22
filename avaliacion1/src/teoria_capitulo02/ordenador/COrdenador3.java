package teoria_capitulo02.ordenador;

public class COrdenador3 {
    String Marca;
    String Procesador;
    String Pantalla;
    boolean OrdenadorEncendido; 

    void EncenderOrdenador() {
        System.out.println("=============================================");
        if (OrdenadorEncendido == true) {
            System.out.println("El ordenador3 ya está encendido.");
        } else {
            OrdenadorEncendido = true;
            System.out.println("El ordenador3 se ha encendido.");
        }
        System.out.println("=============================================");
    }

    void ApagarOrdenador() {
        System.out.println("=============================================");
        if (OrdenadorEncendido == true) {
            OrdenadorEncendido = false;
            System.out.println("El ordenador3 se ha apagado.");
        } else {
            System.out.println("El ordenador3 ya está apagado.");
        }
        System.out.println("=============================================");
    }

    void Estado() {
        System.out.println("Estado del ordenador3" + "\n- Marca: " + Marca + "\n- Procesador: " + Procesador
                + "\n- Pantalla: " + Pantalla);
        if (OrdenadorEncendido == true) {
            System.out.println("El ordenador3 está encendido.");
        } else {
            System.out.println("El ordenador3 está apagado.");
        }
    }
}