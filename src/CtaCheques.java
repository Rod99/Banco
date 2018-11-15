import java.util.Random;

public class CtaCheques extends Cuenta {

    private double sobregiro;
    private int id;

    public CtaCheques(String nombre, Fecha apertura, double saldo, double sobre) {
        super(nombre,apertura, saldo);
        this.sobregiro=sobre;
        this.id = instancias;
    }

    @Override
    public void depositar(double monto){
        if(monto > sobregiro){
            monto -= sobregiro;
            super.depositar(monto);
            System.out.println("Deposito realizado correctamente");
        }else{
            System.out.println("El deposito debe cubir el sobregiro del cheque");
        }
    }
    @Override
    public void retirar(double monto){
        if(monto > super.saldo){
            if(monto > sobregiro + super.saldo){
                System.out.println("No tienes dinero suficiente en tu saldo y tu sobregiro");
            }else {
                System.out.println("Se ha retirado correctamente del saldo y del sobregiro");
                monto =  monto - super.saldo;
                super.saldo = 0;
                sobregiro = sobregiro - monto;
            }
        }else {
            System.out.println("Se retiro efectivamente del saldo");
            super.saldo = super.saldo - monto;
        }
    }
    @Override
    public String toString(){
        return "Cuenta: " + super.nombre + " -Cuenta de Cheques "+ id + "- Saldo: $" + super.saldo +" MXN. Sobregiro: S"+ this.sobregiro + " MXN";
    }
}
