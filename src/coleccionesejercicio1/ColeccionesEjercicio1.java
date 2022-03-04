
package coleccionesejercicio1;

import RazaPerroServicio.RazaPerroServicio;
import java.util.ArrayList;
import java.util.Scanner;

public class ColeccionesEjercicio1 {

    public static void main(String[] args) {
        RazaPerroServicio p1 = new RazaPerroServicio();
        p1.cargarRaza();
        p1.buscarElimar();
        p1.ordenarRaza();
    }
}
