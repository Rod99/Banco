public class CtaAhorros extends Cuenta implements Impuestos{

    private double tasa;
    private int id;


    public CtaAhorros(double saldoa, double tasa1) {
        super(saldoa);
        this.tasa = tasa1;
    }
    public double consultar()
    {
		this.ultima_consulta = UnaFechaxD;
		if (this.apertura.devenegadoM(this.apertura, UnaFechaxD)) {
			this.pagarISRmensual();
			
		}
		if (this.apertura.devenegadoA(this.apertura, UnaFechaxD)) {
			this.pagarISRanual();
		}			
    }


    @Override
    public void pagarISRmensual() {
		if (super.consultar() > 10000.00) {
			super.saldo = super.saldo - super.saldo*ISRm;
		}
    }

    @Override
    public void pagarISRanual() {
		if (super().consultar() > 50000.00)
			this.saldo = this.saldo - this.saldo*ISRa;
    }
}
