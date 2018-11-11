public class Cuenta {
    protected double saldo;
    protected Fecha apertura;
	protected Fecha ultima_consulta;

    public Cuenta(double saldoa) {
        saldo = saldoa;
    }
    

    public Cuenta(String nombre, Fecha fechaApertura, double sal) {

    }

    public double consultar(){
        return this.saldo;
    } 
	

    public void depositar(double monto){
        this.saldo = this.saldo + monto;

    }

    public void retirar(double monto){
        if(monto>this.saldo){
            System.out.println("No puedes, no tienes tanto dinero");
        }else{
            this.saldo = this.saldo - monto;
        }
    }
}
