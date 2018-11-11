import java.util.ArrayList;

public class Banco {
    public static void main (String[] args){
        Fecha hoy = new Fecha(1,1,2018);
        CtaAhorros cta1 = new CtaAhorros("XS2042", hoy, 4620.00, 0.16);
        CtaAhorros cta2 = new CtaAhorros("TF1992", hoy, 10000.00, 0.16);
        CtaAhorros cta3 = new CtaAhorros("KF1996", hoy, 6000.00, 0.16);
        CtaCheques ctac1 = new CtaCheques("RF3166", hoy, 10000.00, 15000.00);
        CtaCheques ctac2 = new CtaCheques("HZ1988", hoy, 8000.00, 15000.00);
        CtaCheques ctac3 = new CtaCheques("GS1992", hoy, 10000.00, 15000.00);
        CtaCredito ctao1 = new CtaCredito("TT1962", hoy, 100000.00, 0.14);
        CtaCredito ctao2 = new CtaCredito("LS1990", hoy, 100000.00, 0.14);
        CtaCredito ctao3 = new CtaCredito("WW1990", hoy, 50000, 0.14);
        ArrayList<Cuenta> ctas1 = new ArrayList<Cuenta>();
        ctas1.add(cta1);
        ctas1.add(ctac1);
        ctas1.add(ctao1);
        ArrayList<Cuenta> ctas2 = new ArrayList<Cuenta>();
        ctas2.add(cta2);
        ctas2.add(ctac2);
        ctas2.add(ctao2);
        ArrayList<Cuenta> ctas3 = new ArrayList<Cuenta>();
        ctas3.add(cta2);
        ctas3.add(ctac2);
        ctas3.add(ctao2);
    }
}
