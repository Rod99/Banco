public class Cuenta {
    protected double saldo;
    protected String nombre;
    protected Fecha apertura;
	protected Fecha ultima_consulta;
	public static int instancias = 1;
    public Cuenta(String nombre, double saldoa) {
        this.saldo = saldoa;
        this.nombre = nombre;
        instancias++;
    }
    public Cuenta(String nombre, Fecha fechaApertura, double sal) {
        this.nombre = nombre;
        this.apertura = fechaApertura;
        this.ultima_consulta = fechaApertura;
        this.saldo = sal;
        instancias++;
    }

    public double consultar(){
        this.ultima_consulta.consulta();
        return this.saldo;
    } 

    public void depositar(double monto){
        this.saldo = this.saldo + monto;
    }

    public void retirar(double monto){
        if(monto>this.saldo){
            System.out.println("No puedes, no tienes tanto dinero en tu saldo");
        }else{
            this.saldo = this.saldo - monto;
        }
    }
}
