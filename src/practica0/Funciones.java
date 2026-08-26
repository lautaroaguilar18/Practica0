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
	
	// Función para ejercício del texto "pensando la computación"
	
	public static int contarLetrasIndexOf(String cadena, char letra ) {
		int contador = 0;
		int indice = 0;
		int pos = cadena.indexOf(letra, indice);
		while (pos != -1) {
			contador++;
			indice = pos + 1;
			pos = cadena.indexOf(letra, indice);
		}
		return contador;
	}
	
	// Función para ejercício 9:
	
	public static void imprimirFecha(int dia, int mes, int año) {
		String[] meses = new String[] { "Enero", "Febrero", "Marzo", "Abril",
				"Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre",
				"Diciembre" 
		};
		System.out.println(dia + " de " + meses[mes - 1] + " de " + año);
	}
	
	// Función para ejercício 10:
	
	public static int sumatoria(int n) {
		int numero = 1;
		int sumatoria = 0;
		while (numero <= n) {
			sumatoria = sumatoria + numero;
			numero ++;
		}
		return sumatoria;
	}
	
	
	// Función para ejercício 11:
	
	public static int sumatoriaPares(int n) {
		int numero = 2;
		int sumatoria = 0;
		while (numero <= n) {
			sumatoria = sumatoria + numero;
			numero = numero + 2;
		}
		return sumatoria;
	}
	
	
	// Función para ejercício 12:
	
	public static double potencia(double x, int a) {
		double resultado = 1.0;
		for (int i = 0; i < a; i++) {
			resultado = resultado * x;
		}
		return resultado;
	}
	
	
	// Función para ejercício 13:
	
	public static double factorial (int n ) {
		double resultado = 1.0;
		for (int i = 1; i <= n; i++) {
			resultado = resultado * i;
		}
		return resultado;
	}
		
		
	// Función para ejercício 14:
		
	public static int cantCifras(int n) {
		if (n == 0) {
			return 1;}
		int contador = 0;
		while (n > 0) {
			n = n / 10;
			contador++;
			}
		return contador;
	}
	
	
	// Función para ejercício 15:
	
	public static boolean esDivisible(int n, int m) {
		if (n % m == 0) {
			return true;
		}
		else {
			return false;
		}
	}
    
	
	
	// Función para ejercício 16:
	
	public static String invertir(String texto) {
		String resultado = "";
		for (int i = texto.length() -1; i >= 0; i--) {
			resultado = resultado + texto.charAt(i);
		}
		return resultado;
	}
	
	
	
	// Función para ejercício 16 b y d:
	
	public static void imprimirReversa(String cadena) {
		System.out.println(invertir(cadena));
	}
	
	
	
	// Función para ejercício 17:
	
	public static int cantidadApariciones(String s, char c) {
		int aparece = 0;
		int tamaño = s.length();
		for (int i = 0; i < tamaño; i++) {
			if (c == s.charAt(i)) {
				aparece++;
			}
		}
		return aparece;
		
	}
	
	
	
	// Función para ejercício 18:
	
	public static int cantidadVocales(String s) {
		String vocales = "aeiou";
		int cantVocales = 0;
		int tamaño = s.length();
		for (int i = 0; i < tamaño; i++) {
			if (vocales.indexOf(s.charAt(i)) != -1) {
				cantVocales++;
			}
		}
		return cantVocales;
	}
	
	
	
	// Función para ejercício 19:
	
	public static String quitarTildes(String texto) {
		return texto.replace('á', 'a')
				    .replace('é', 'e')
				    .replace('í', 'i')
				    .replace('ó', 'o')
				    .replace('ú', 'u');
				    
	}
	
	public static boolean esAbecedaria(String s) {
		s = Funciones.quitarTildes(s.toLowerCase());
		int texto = s.length()-1;
		for (int i = 0; i < texto; i++) {
			if (s.charAt(i) > s.charAt(i + 1)) {
				return false;
			}
		}
		return true; 
	}
	
	
	
	// Funcion para ejercicio 20: 
	
	public static boolean esCapicua(String s) {
		s = Funciones.quitarTildes(s.toLowerCase());
		int texto = s.length() - 1;
		for (int i = 0; i < texto / 2; i++) {
			if (s.charAt(i) != s.charAt(texto - i)) {
				return false;
			}
		}
		return true;
	}
	
	
	
	// Funcion para ejercicio 21:
	
	public static boolean esSinRepetidos(String s) {
		s = Funciones.quitarTildes(s.toLowerCase());
		int tamaño = s.length();
		for(int i = 0; i < tamaño; i++) {
			for(int j = i + 1; j < tamaño; j++) {
				if (s.charAt(i) == s.charAt(j)) {
					return false;
					
				}
			}
		}
		return true;
	}
	
	
	// Funcion para ejercicio 22:
	
	public static String sinRepetidos(String s) {
		String nuevaCadena = "";
		s = Funciones.quitarTildes(s.toLowerCase());
		int tamaño = s.length();
		for(int i = 0; i < tamaño; i++) {
			char letraActual = s.charAt(i);
			if (nuevaCadena.indexOf(letraActual) == -1) {
				nuevaCadena = nuevaCadena + letraActual;
			}
		}
		return nuevaCadena;
	}

	
	
	
	
	
	
}
		
	
	

