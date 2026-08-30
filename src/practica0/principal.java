package practica0;

import java.util.Scanner;

public class principal {
	public static void main(String[] args) {
		System.out.println("Ingrese un numero: ");
		// Ejercicio 2
		
		Scanner scan = new Scanner(System.in);
		/*System.out.println("Ingrese su nombre: ");
		String nombreDeusuario = scan.nextLine();
		Funciones.saludarUsuario(nombreDeusuario);
		
		
		// Ejercicio 3 
		
		/*System.out.println("Ingrese n1");
		int n1 = scan.nextInt();
		
		System.out.println("Ingrese n2");
		int n2 = scan.nextInt();
		
		Funciones.sumar(n1, n2);*/
		
		
		
		// Ejercicio 5
		
		/*System.out.println("Ingrese n1");
		double n1 = scan.nextInt();
		
		System.out.println("Ingrese n2");
		double n2 = scan.nextInt();
		
		Funciones.promedio(n1, n2);*/
		
		
		
		// Ejercicio 8
		
		/*System.out.println("Ingrese x");
		double x = scan.nextDouble();
		
		System.out.println("Ingrese y");
		double y = scan.nextDouble();
		
		Funciones.ponerNota(x, y);
		
		
		
		// Ejercicio texto "pensando la computación"
		
		int cantidadA = Funciones.contarLetras("banana", 'a');
		System.out.println("La letra 'a' aparece: " + cantidadA + " veces.");
		
	
	
	
	    // Ejercicio texto "pensando la computación"
	    int cantidad = Funciones.contarLetrasIndexOf("Banana", 'a');
	    System.out.println("La letra 'a' aparece: " + cantidad + " veces.");
		
		
		
		// Ejercicio 9
		
	    Funciones.imprimirFecha(05, 07, 2007);
		
		
		
		// Ejercicio 10
		
		int resultado = Funciones.sumatoria(5);
		System.out.println("La sumatoria es: " + resultado);
		
		
		
		// Ejercicio 11
		
		int resultado = Funciones.sumatoriaPares(6);
		System.out.println("La sumatoria es: " + resultado);
		
		
		
		// Ejercicio 12
		
		double resultadoPotencia = Funciones.potencia(5.0, 2);
		System.out.println(resultadoPotencia);
		
		
		
		// Ejercicio 13
		
		System.out.println("Ingrese un numero entero para calcular su factorial: ");
		int n = scan.nextInt();
		double resultado = Funciones.factorial(n);
		System.out.println("El factorial de " + n + " es: " + resultado);
		
		

		// Ejercicio 14
		
		System.out.print("Ingrese un numero entero para contar sus cifras: ");
		int numero = scan.nextInt();
		int resultado = Funciones.cantCifras(numero);
		System.out.println("El numero " + numero + " tiene " + resultado + " cifras");
		
		
		
		// Ejercicio 15
		
		System.out.println("Ingrese el numero 1: ");
		int numero1 = scan.nextInt();
		System.out.println("Ingrese el numero 2: ");
		int numero2 = scan.nextInt();
		boolean resultado = Funciones.esDivisible(numero1, numero2);
		System.out.println(resultado);
		
	
	    // Ejercicio 16
	
	    System.out.println("Ingrese un texto: ");
	    String texto = scan.nextLine();
	    String resultado = Funciones.invertir(texto);
	    System.out.print(resultado);
	    
	    
		 // Ejercicio 16 b y d
		
		System.out.print("Ingrese un texto: ");
		String texto = scan.nextLine();
		Funciones.imprimirReversa(texto);
	    		
	    		
		// Ejercicio 17
		
		System.out.println("Ingrese un texto: ");
		String texto = scan.nextLine();
		System.out.println("Ingrese el caracter a buscar: ");
		char caracter = scan.nextLine().charAt(0);
		int cantApariciones = Funciones.cantidadApariciones(texto, caracter);
		System.out.println("La letra " + caracter + " aparece " + cantApariciones + " veces");
	   
	
	    // Ejercicio 18
	    
		String texto = scan.nextLine();
		int cantApariciones = Funciones.cantidadVocales(texto);
		System.out.println(cantApariciones);
		
		
		
		// Ejercicio 19
		
		String texto = scan.nextLine();		
		boolean esAbecedaria = Funciones.esAbecedaria(texto);
		System.out.println(esAbecedaria);				
	    
		
		
		// Ejercicio 20
		
		String texto = scan.nextLine();
		boolean esCapicua = Funciones.esCapicua(texto);
		System.out.println(esCapicua);
		
		
		
		// Ejercicio 21
		
		String texto = scan.nextLine();
		boolean resultado = Funciones.esSinRepetidos(texto);
		System.out.println(resultado);
		
		
		
		// Ejercicio 22:
		
		String texto = scan.nextLine();
		String resultado = Funciones.sinRepetidos(texto);
		System.out.println(resultado);
		
		
		// Ejercicio 23:
		
		String a = scan.nextLine();
		System.out.println("Ingrese un texto b: ");
		String b = scan.nextLine();
		System.out.println("Ingrese un texto c: ");
		String c = scan.nextLine();
		boolean resultado = Funciones.puedenColocarse(a, b, c);
		System.out.println(resultado);
		
		
		
		// Ejercicio 24:

		String a = scan.nextLine();
		boolean resultado = Funciones.esDoblete(a);
		System.out.println(resultado);
		
		
		
		// Ejercicios 25: 
		
		int[] numeros = {-2, -8, 1, 0, -4, -3};
		int max1 = Funciones.maximo(numeros);
		System.out.println("El maximo numero del arreglo 'numeros' es: " + max1);
		
		
		
		// Ejercicio 26:
		
		int[] numeros = {-2, -8, -2, 0, -4, 5};
		int indicemax1 = Funciones.maximoIndice(numeros);
		System.out.println("El indice del arreglo con el valor mas alto es: " + indicemax1);
		
		
		
		// Ejercicio 27:
		
		int[] numeros = {1, 2, 3, 4, 5, 6};
		int totalSuma = Funciones.suma(numeros);
		System.out.println("La suma de todos los valores de 'numeros' = " + totalSuma);
		
		
		
		// Ejercicio 28:
		
		int[] arreglo1 = {1, 2, 3, 4, 5, 6};
		boolean estaOrdenado = Funciones.estaOrdenado(arreglo1);
		System.out.println("Los elementos del 'arreglo' estan ordenados?: " + estaOrdenado);
		
		
		
		// Ejercicio 29:
		
		double[] arregloA = {1.0, 2.0, 3.0, 4.5, 5.5, 6.5};
		double resultado = Funciones.promedio(arregloA);
		System.out.println("El promedio de la suma de todos los elementos es: " + resultado);*/
		
		
		
		// Ejercicio de recursión:
		
		int n = scan.nextInt();
		int resultado = Funciones.siguientePrimo(n);
		System.out.println(resultado);

		scan.close();
	}	
}		
		

		
		
		
		
		
		
		
		
	
	
	
	
	
	

