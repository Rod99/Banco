import java.util.Scanner;

public class CtaAhorros extends Cuenta implements Impuestos {

    private double tasa;
    private int id;
    private Fecha UnaFechaxD = new Fecha(1,1,2018);

    public CtaAhorros(String nom, Fecha apr, double saldoa, double tasa1){
        super(nom, apr, saldoa);
        this.tasa = tasa1;
        this.id = instancias;
    }

    public double consultar(){
        int dia, mes, anio;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el dia en la que estás consultando\n");
        dia = teclado.nextInt();
        System.out.println("Ingresa el mes en la que estás consultando\n");
        mes = teclado.nextInt();
        System.out.println("Ingresa el anio en la que estás consultando\n");
        anio = teclado.nextInt();

        UnaFechaxD.establecerFecha(dia,mes,anio);
		if (super.apertura.devenegadoM(super.apertura, UnaFechaxD)){
            this.pagarISRmensual();
            super.saldo += super.saldo*this.tasa;
        }
		if (super.apertura.devenegadoA(super.apertura, UnaFechaxD))
			this.pagarISRanual();

		return super.saldo;
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
