package RazaPerroServicio;

import java.util.ArrayList;
import java.util.Scanner;
import RazaPerroEntidades.RazaPero;

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
            
            p1=(leer.next());
            
            listaRaza.add(new RazaPero(p1));
            
            System.out.println("Quiere ingresar otra raza ?");
            respuesta = leer.next();
            
        } while (respuesta.equalsIgnoreCase("Si"));
        
        for (RazaPero razaPero : listaRaza) {
            System.out.println(razaPero.getRaza());
        }
    }
}

