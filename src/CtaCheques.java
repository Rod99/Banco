public class CtaCheques extends Cuenta {

    private double sobregiro;
    private int id;

    public CtaCheques(String nombre,double sobre,Fecha apertura) {
        super(nombre,apertura);
        this.sobregiro=sobre;
    }

    @Override
    public void depositar(double monto){

    }
    @Override
    public void retirar(double monto){
        if (apertura) {
            if(monto > super.saldo){
                if(monto > sobregiro + super.saldo){
                    System.out.println("No tienes dinero suficiente en tu saldo y tu sobregiro");
                }else {
                    System.out.println("Se ha retirado correctamente del saldo y del sobregiro");
                    sobregiro = sobregiro - (monto - super.saldo);

                }
            }else {
                System.out.println("Se retiro efectivamente del saldo");
                super.saldo = super.saldo - monto;
            }
        }
    }
}
