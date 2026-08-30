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
		int texto = s.length();
		for (int i = 0; i < texto / 2; i++) {
			if (s.charAt(i) != s.charAt(texto - 1 - i)) {
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
	
	
	
	// Funcion para ejercicio 23:
	
	public static int sePuedenCruzar(String ver,String hor) {
		for(int i=0;i<ver.length();i++) {
			if(hor.indexOf(ver.charAt(i)) >= 0) {
				return i;
			}
		}
		return -1;
	}
	
	
	public static boolean puedenColocarse(String a, String b, String c) {
		a = Funciones.quitarTildes(a.toUpperCase());
		b = Funciones.quitarTildes(b.toUpperCase());
		c = Funciones.quitarTildes(c.toUpperCase());
		
		int posA = Funciones.sePuedenCruzar(b, a);											
		
		if(posA < 0) {
			return false;
		}
		int posC = Funciones.sePuedenCruzar(b, c);
		if(posC < 0) {
			return false;
		}
		if(posA >= posC) {
			return false;
		}
		if(posC - posA < 2) {
			return false;
		}
		
		return true;
	}
	
	
	
	// Funcion para ejercicio 24:
	
	public static boolean esDoblete(String s) {
		s = Funciones.quitarTildes(s.toLowerCase());
		int tamaño = s.length();
		for (int i = 0; i <= tamaño; i++) {
			String comparacion1 = s.substring(0, i);
			String comparacion2 = s.substring(i);
			if (Funciones.esCapicua(comparacion1) && Funciones.esCapicua(comparacion2)) {
				return true;		
			}
		
		}
		return false;		
	}
	
	 
	/*Funcion para ejercicio de arreglos:
	   
	   Como ejercicio, escribí un método llamado clonarArreglo que toma
	   un arreglo de enteros como parámetro, crea un nuevo arreglo del mismo
	   tamaño, copia los elementos del primer arreglo al nuevo, y devuelve una
	   referencia al nuevo arreglo.*/
	
	public static int [] clonarArreglo(int[] a) {
	int[] copia = new int[a.length];
	
	for (int i = 0; i < a.length; i++) {
		copia[i] = a[i];
	}
	return copia;
	}
	
	
	// Ejercicio 25: 
	
	public static int maximo(int[] a) {
		int valorMasAlto = a[0];
		for(int i = 1; i < a.length; i++) {
			if (a[i] > valorMasAlto) {
				valorMasAlto = a[i];
			}
		}
		return valorMasAlto;
	}
	
	
	// Ejercicio 26: 
	
	public static int maximoIndice(int[] a) {
		int indiceMaximo = 0; 
		for(int i = 1; i < a.length; i++) {
			if (a[i] > a[indiceMaximo]) {
				indiceMaximo = i;
			}
		}
		return indiceMaximo;
	}
	
	
	// Ejercicio 27:
	
	public static int suma(int[] a) {
		int totalSuma = 0;
		for(int i = 0; i < a.length; i++) {
			totalSuma = totalSuma + a[i];
		}
		return totalSuma;
	}
	
	
	// Ejercicio 28:
	
	public static boolean estaOrdenado(int[] a) {
		for (int i = 0; i < a.length -1; i++) {
			if (a[i] > a[i+1]) {
				return false;
			}
		}
		return true;
	}
	
	
	// Ejercicio 29:
	
	public static double promedio(double[] a) {
		double tamañoA = a.length;
		double suma = 0;
		double promedio = 0;
		for ( int i = 0; i < tamañoA; i++) {
			suma = suma + a[i]; 
		}
		promedio = suma/tamañoA;
		return promedio;
	}
	
	
	// Ejercicio 30
	
	
	public static int sumatoriaRec (int n) {
		if (n==0) {
			return 0;
		}
		return n + sumatoriaRec(n - 1);
	}
	
	
	// Ejercicio 30 b)
	
	public static int sumatoriaParesRec(int n) {
		if (n<=0) {
			return 0;
		}
		if (n % 2 == 0) {
			return n + sumatoriaParesRec(n - 1);
		}else {
			return sumatoriaParesRec(n - 1);
		}
	}
	
	
	// Ejercicio 30 c)
	
	public static int potenciaRec(double x, int n) {
		if (n == 0) {
			return 1;
		}
		return (int) (x * potenciaRec(x, n - 1));
	}
	
	
	// Ejercicio 30 d)
	
	public static int factorialRec(int n ) {
		if (n == 0) {
			return 1;
		}
		return n * (factorialRec(n - 1));
	}
	
	
	// Ejercicio 31 a)
	
	public static int fibrec(int n) {
		if (n <= 1) {
			return n;
		}
		return fibrec(n - 2) + fibrec(n - 1);
	}
	
	
	// Ejercicio 31 b)
	
	public static int fibiter(int n) {
		if (n <= 1) {
			return n;
		}
		int a = 0;
		int b = 1;
		
		for (int i = 2; i <= n; i++) {
			int siguiente = a + b;
			a = b;
			b = siguiente;
		}
		return b;
	}
	
	// Ejercicio 32
	
	public static void collatz(int n) {
		System.out.println(n);
		
		if (n == 1) {
			return;
		}
		if (n % 2 == 0) {
			collatz(n / 2);
		} else { 
			collatz(3 * n + 1);
		}
	}
	
	// Ejercicio 33
	
	public static int mcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return mcd(b, a%b);
	}
	
	// Ejercicio 34
	
	public static String intercalarAsteriscos(String s) {
		if (s.length() <= 1) {
			return s;
		}
		return s.charAt(0) + "*" + intercalarAsteriscos(s.substring(1));
	}
	
	// Funcion resto:
	
	public static String resto(String s) {
		return s.substring(1);
	}
	
	// Ejercicio 35
	
	public static String recsinRepetidos(String s) {
		if (s.length() <= 1) {
			return s;
		}
		if (s.charAt(0) == s.charAt(1)) {
			return recsinRepetidos(resto(s));
		}else {
			return s.charAt(0) + recsinRepetidos(resto(s));
		}
	}
	
	// Ejercicio 36
	
		public static int prodCifras(int n) {
			if (n < 10) {
				if (n == 0) {
					return 1;
				}
				return n;
			}
			int ultimaCifra = n % 10;
			int resto = n / 10;
			if (ultimaCifra == 0) {
				return prodCifras(resto);
			}else {
				return ultimaCifra * prodCifras(resto);
			}
		}
	
		// Ejercicio 37:
		
		public static String estaPrimera(String s1, String s2) {
			if (s1.isEmpty()) return s1;
			if (s2.isEmpty()) return s2;
			
			if (s1.charAt(0) < s2.charAt(0)) {
				return s1;
			}
			if (s2.charAt(0) < s1.charAt(0)) {
				return s2;
			}
			String resultadoResto = estaPrimera(Funciones.resto(s1), Funciones.resto(s2));
			
			return s1.charAt(0) + resultadoResto;
		}
		
		// Ejercicio 38:
		
		public static String rotacion(String s, int n) {
			if (s.isEmpty()) {
				return s;
			}
			n = n % s.length();
			
			if(n == 0) {
				return s;
			}
			return rotacion(resto(s) + s.charAt(0), n - 1);
			
		}
		
		/* Todo lo hecho hasta el momento, fue lo de la practica 0.
		   a continuación vienen ejercicios de la solapa "Funciones
		   recursivas" del campus */
		
		// Devuelve la suma de los números enteros desde 0 hasta n inclusive.
		
		public static int sumarHasta(int n) {
			if (n == 0) {
				return n;
			}
			return n + sumarHasta(n - 1);
		}
		
		// Devuelve la suma de los números pares desde 0 hasta n inclusive.
		
		public static int sumarParesHasta(int n) {
			if (n == 0) {
				return n;
			}
			if (n % 2 == 0) {
				return n + sumarParesHasta(n - 1);
			}
			return sumarParesHasta(n - 1);
		}
		
		/*Imprime por pantalla los números desde 1 hasta n inclusive, 
		  en orden ascendente. */
		
		public static void imprimirHasta(int n) {
			if (n == 0) {
				return;
			}
			imprimirHasta(n - 1);
			System.out.println(n);
		}
		
		/*Imprime por pantalla los números desde n hasta 1, 
		   en orden descendente. */
		
		public static void imprimirDesde(int n) {
			if (n == 0) {
				return;
			}
			System.out.println(n);
			imprimirDesde(n - 1);
		}
		
		// Calcula a elevado a la b.
		
		public static int potencia(int a, int b) {
			if (b == 0) {
				return 1;
			}
			return a * potencia(a, b - 1);
		}
		
		/*Calcula la cantidad de números primos que hay entre m y n.
		  Observación: Escribir una función auxiliar no recursiva 
		  que indique si un número es primo. */
		
		public static boolean esPrimo (int n) {
			if (n <= 1) {
				return false;
			}
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					return false;
				}
			}
			return true;
		}
		
		public static int cantidadDePrimosEntre(int m, int n) {
			if (m > n) {
				return 0;
			}
			if (Funciones.esPrimo(m)){
				return 1 + cantidadDePrimosEntre(m + 1, n);
			}
			return cantidadDePrimosEntre(m + 1, n);
		}
		
		// Calcula el primer número primo mayor a n.

		public static int siguientePrimo(int n) {
			if (Funciones.esPrimo(n + 1)) {
				return n + 1;
			}
			return siguientePrimo(n + 1);
		}
		
		/*Indica si un número es par ó no.
		 Observación: no usar el operador módulo, es decir,
		 no vale usar n % 2 == 0. */
		
		public static boolean esPar(int n) {
			if(n == 0) {
				return true;
			}
			if(n == 1) {
				return false;
			}
			return esPar(n - 2);
		}
		
		/* Ahora vamos a continuar con los ejercicios de recrusion
		   con Strings. */
		
		
		public static int longitud (String s) {
			if (s.equals("")) {
				return 0;
			}
			return 1 + longitud (Funciones.resto(s));
		}
		
		
		public static void imprimirEspaciado(String s) {
			if (s.equals("")) {
				return;
			}
			System.out.print(s.charAt(0) + " ");
			
			imprimirEspaciado(Funciones.resto(s));
		}
		
		
		public static void intercalarAsterisco(String s) {
			if (s.equals("")) {
				return;
			}
			if (Funciones.resto(s).equals("")) {
				System.out.print(s.charAt(0));
			}
			else {
				System.out.print(s.charAt(0) + "*");
				intercalarAsterisco(Funciones.resto(s));
			}
		}
		
		
		 public static String reverso(String s) {
			 if (s.equals("")) {
				 return "";
			 }
			 return reverso(Funciones.resto(s)) + s.charAt(0);
		 }
}


		
	
	

