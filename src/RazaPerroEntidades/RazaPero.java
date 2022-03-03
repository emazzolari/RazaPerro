
package RazaPerroEntidades;

public class RazaPero {
    
    private String raza;

    public RazaPero() {
    }

    public RazaPero(String raza) {
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "RazaPero{" + "raza=" + raza + '}';
    }
    
    
    
}
