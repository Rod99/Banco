public class CtaCredito extends Cuenta{
    private double tasa;
    private double deficit;
    private int id;

    public CtaCredito(String nombre, Fecha unafecha, double sal, double tasa1) {
        super(nombre,unafecha,sal);
        this.tasa = tasa1;
        this.id = instancias;
        this.deficit = 0;
    }
    @Override
    public String toString(){
        return "Cuenta: " + super.nombre + " -Cuenta de Credito "+ id + "- Saldo: $" + super.saldo +" MXN. Tasa de interes: "+ this.tasa*10 + "% Deuda total: $" + this.deficit + " MXN" ;
    }
    @Override
    public void depositar(double monto){
        if(monto > this.deficit){
            monto -= this.deficit;
            super.depositar(monto);
            System.out.println("Deposito realizado correctamente");
        }else{
            this.deficit -= monto;
            System.out.println("Deposito realizado correctamente, aplicado a deuda");
        }
    }

    @Override
    public void retirar(double monto){
        if(monto > super.saldo){
            monto -=  super.saldo;
            super.saldo = 0;
            this.deficit += monto;
        }else{
            super.retirar(monto);
            System.out.println("Se retiro efectivamente del saldo");
        }
        if(super.apertura.devenegadoM(super.apertura, UnaFecha) ){
            this.deficit +=  this.deficit*this.tasa;
        }
    }
}
