public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public Fecha obtenerFecha() {
        return this;
    }
	public int getMes () {
		return this.mes;
	}
	public int getAnio () {
		return this.anio;
	}
	public void consulta(){
        if(this.dia>=30){
            this.dia=1;
            this.mes++;
        }else
            this.dia++;
	}
	public int getDia () {
        return this.dia;
    }
	public boolean devenegadoM (Fecha f1, Fecha f2) { // Si ha pasado un mes
		return (f1.getAnio() < f2.getAnio() || f1.getMes() < f2.getMes());
	}
	public boolean devenegadoA (Fecha f1, Fecha f2) { // Si ha pasado un año
        return (f1.getAnio() < f2.getAnio());
	}

    public void establecerFecha(int d, int m, int a) {
        this.dia = d;
        this.mes = m;
        this.anio = a;
    }
}
