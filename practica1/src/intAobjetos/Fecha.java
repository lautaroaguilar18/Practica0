package intAobjetos;

public class Fecha {
	public int dia;
	public int mes;
	public int anio;
	
	
	public Fecha() {
		this.dia = 1;
		this.mes = 1;
		this.anio = 1970;
	}
	
	
	public Fecha(int dia, int mes, int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}
	
	
	public void imprimir() {
		System.out.println(this.dia + " /" + this.mes + " /" + this.anio);
	}
	
	
	public boolean esVerano() {
		if (this.mes == 1) {
			return true;
		}else if (this.mes == 12 && this.dia >= 21) {
			return true;
		}else if (this.mes == 3 && this.dia <= 21) {
			return true;
		}
		return false;
	}
	
	
	public static boolean esBisiesto(int anio) {
		if (anio % 4 == 0 && anio % 100 != 0) {
			return true;
		}else if (anio % 400 == 0) {
			return true;
		}
		return false;
	}
	
}

