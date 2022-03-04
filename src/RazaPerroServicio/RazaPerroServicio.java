package RazaPerroServicio;

import java.util.ArrayList;
import java.util.Scanner;
import RazaPerroEntidades.RazaPero;
import java.util.Collections;
import java.util.Iterator;

public class RazaPerroServicio {

    private ArrayList<RazaPero> listaRaza;
    private Scanner leer; // Creo el Scanner para utilizar en toda mi clase

    //Esta es una muy buena practica
    public RazaPerroServicio() {
        this.listaRaza = new ArrayList<>(); // Creo el espacio en memoria del LISTA
        this.leer = new Scanner(System.in).useDelimiter("\n");// Cuando se invoca la clase, habilita el flujo de datos
    }

    public void cargarRaza() {
        //RazaPero p1 = new RazaPero();
        String respuesta = "";
        String p1;
        do {

            System.out.println("Ingrese una raza");

            p1 = (leer.next());

            listaRaza.add(new RazaPero(p1));

            System.out.println("Quiere ingresar otra raza ?");
            respuesta = leer.next();

        } while (respuesta.equalsIgnoreCase("Si"));

        for (RazaPero razaPero : listaRaza) {
            System.out.println(razaPero.getRaza());
        }
    }

    public void buscarElimar() {

        System.out.println("Ingrese la raza para eliminar");
        String elimraza = leer.next();
        boolean aux = false;
        Iterator<RazaPero> it = listaRaza.iterator();
        while (it.hasNext()) {
            if (it.next().getRaza().equals(elimraza)) { // Si se cumple la condicion de encontrar "Ese apellido elegido,lo elimina)
                it.remove(); aux=true; System.out.println("La raza se elimino");
            }else;           
        }
       if (aux == false){
           System.out.println("La raza no se encuentra");
       }
    }

public void ordenarRaza() {
        Collections.sort(listaRaza,
                (RazaPero objeto1, RazaPero objeto2) -> objeto1.getRaza().compareTo(objeto2.getRaza()));
        System.out.println(listaRaza);
    }
}
