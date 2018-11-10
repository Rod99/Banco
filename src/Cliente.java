import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private ArrayList<Cuenta> cuentas;
    private int numCentas;
    private String numCuenta;

    public Cliente(String nom) {

    }

    public Cliente(String nom, ArrayList<Cuenta> ctas){

    }

    public void agregarCuenta(Cuenta cta){

    }

    public Cuenta obtenerCuenta(int index){
        return this.cuentas.get(index);
    }

    public void reportarEdosCtas(){

    }
}
