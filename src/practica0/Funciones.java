package practica0;

public class Funciones {
	
	// Función que resuelve el ejercício 1
	public static void saludarMundo() {
		System.out.println("¡Hola, mundo!");
	}
	
	// Función para el ejercicio 2
	public static void saludarUsuario(String nombre) {
		System.out.println("Hola " + nombre);
	}
		
	// Función para el ejercicio 3
	public static void sumar(int n1, int n2) {
		int resultado = n1 + n2;
		System.out.println("El resultado es " + resultado);
	}
	
	// Función para el ejercicio 5
	public static void promedio(double n1, double n2) {
		double resultado = (n1 + n2)/2;
		System.out.println("El promedio es " + resultado);
	}
	
	// Función para el ejercicio 8
	
	public static void ponerNota(double x, double y) {
		double resultado = (x + y)/2;
		
		if(resultado >= 7) {
			System.out.println("Promocionado");
		}
		else if(resultado >= 4) {
			System.out.println("Aprobado");
		}
		else {
			System.out.println("Debe Recuperar");
		}
	
	}
	
	// Función para ejercício del texto "pensando la computación"
	
	public static int contarLetras(String cadena, char letra) {
		int largo = cadena.length();
		int contador = 0;
		int indice = 0;
		while (indice < largo) {
			if (cadena.charAt(indice) == letra) {
				contador = contador + 1;
			}
			indice = indice + 1;
		}
		return contador;
	}
}

