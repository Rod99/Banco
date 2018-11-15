import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private ArrayList<Cuenta> cuentas;
    private int numCentas;
    private String nomCuenta;

    public Cliente(String nom) {
        this.nombre = nom;
        this.numCentas = 0;
    }

    public Cliente(String nom, ArrayList<Cuenta> ctas){
        this.nombre = nom;
        this.numCentas = ctas.size();
        this.cuentas = ctas;
    }

    public void agregarCuenta(Cuenta cta){
        this.cuentas.add(cta);
        this.numCentas = this.cuentas.size();
    }

    public Cuenta obtenerCuenta(int index){
        return this.cuentas.get(index);
    }

    public void reportarEdosCtas(){
        for(int i=0; i<this.numCentas; i++){
            System.out.println(this.cuentas.get(i));
        }
    }
}
