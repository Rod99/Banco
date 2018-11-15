

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
        Cliente Cliente1 = new Cliente("yo");
        Cliente Cliente2 = new Cliente("tu");
        Cliente Cliente3 = new Cliente("nosotros");


        ArrayList<Cuenta> ctas2 = new ArrayList<Cuenta>();
        ctas2.add(cta2);
        ctas2.add(ctac2);
        ctas2.add(ctao2);
        ArrayList<Cuenta> ctas3 = new ArrayList<Cuenta>();
        ctas3.add(cta2);
        ctas3.add(ctac2);
        ctas3.add(ctao2);

        for (Cuenta aCtas1 : ctas1) {
            Cliente1.agregarCuenta(aCtas1);
            aCtas1.consultar();
            aCtas1.depositar(2000.00);
            aCtas1.retirar(3000.00);
        }

        for (Cuenta aCtas2 : ctas2) {
            Cliente2.agregarCuenta(aCtas2);
            aCtas2.consultar();
            aCtas2.depositar(2000.00);
            aCtas2.retirar(3000.00);
        }

        for (Cuenta aCtas3 : ctas3) {
            Cliente3.agregarCuenta(aCtas3);
            aCtas3.consultar();
            aCtas3.depositar(2000.00);
            aCtas3.retirar(3000.00);
        }

        Cliente1.reportarEdosCtas();
        Cliente2.reportarEdosCtas();
        Cliente3.reportarEdosCtas();
    }
}
