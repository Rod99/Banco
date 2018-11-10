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
	public int getDia () {
		return this.dia;
	}
	public boolean devenegadoM (Fecha f1, Fecha f2) {
		if (f1.getAnio() < f2.getAnio()) {
			return true;
		}else{
			int x = 30 - f1.getDia();
			return (f2.getDia() + x >= 30);
		}
	}
	public boolean devenegadoA (Fecha f1, Fecha f2) {
		return (f1.getAnio() < f2.getAnio());
	}

    public void establecerFecha(int d, int m, int a) {
        this.dia = d;
        this.mes = m;
        this.anio = a;
    }
}
