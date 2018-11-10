public class Cuenta {
    protected double saldo;
    protected Fecha apertura;
	protected Fecha ultima_consulta;

    public Cuenta(double saldo) {

    }

    public Cuenta(String nom, Fecha fechaApertura){

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
