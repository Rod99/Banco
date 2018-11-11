public class CtaAhorros extends Cuenta implements Impuestos {

    private double tasa;
    private int id;

    public CtaAhorros(String nom, Fecha apr, double saldoa, double tasa1){
        super(nom, apr, saldoa);
        this.tasa = tasa1;
        this.id = instancias;
    }

    public double consultar(){
		if (super.apertura.devenegadoM(super.apertura, UnaFechaxD)){
            this.pagarISRmensual();
            super.saldo += super.saldo*this.tasa;
        }
		if (super.apertura.devenegadoA(super.apertura, UnaFechaxD))
			this.pagarISRanual();
    }

    @Override
    public String toString(){
        return "Cuenta: " + super.nombre + " -Cuenta de Ahorros "+ id + "- Saldo: $" + super.saldo +" MXN. Tasa de interes: "+ this.tasa*10 + "%";
    }

    @Override
    public void pagarISRmensual() {
		if (super.saldo > 10000.00)
			super.saldo = super.saldo - super.saldo*ISRm;
    }

    @Override
    public void pagarISRanual() {
		if (super.saldo > 50000.00)
            super.saldo = super.saldo - super.saldo*ISRa;
    }
}
