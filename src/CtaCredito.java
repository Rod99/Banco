public class CtaCredito extends Cuenta{
    private double tasa;
    private double deficit;
    private int id;

    public CtaCredito(double sal,double tasa1,String nombre, Fecha unafecha) {
        super(nombre,unafecha,sal);
        this.tasa=tasa1;
    }

    @Override
    public void depositar(double monto){

    }

    @Override
    public void retirar(double monto){

    }
}
