public class CtaCredito extends Cuenta{
    private double tasa;
    private double deficit;
    private int id;

    public CtaCredito(double sal,double tasa1) {
        super(sal);
        this.tasa=tasa1;
    }

    @Override
    public void depositar(double monto){

    }

    @Override
    public void retirar(double monto){

    }
}
