package intAobjetos;

public class Arreglos {
	
	static boolean esSinRepetidos(int[] arr) {
		for (int ite = 0; ite < arr.length; ite++) {
			
			for (int i = ite + 1; i < arr.length; i++) {
				
				if (arr[ite] == arr[i]) {
					return false;
				}
			}
		}return true;
	}
	
	static int[] pegar(int[] arr, int[] arr2) {
		int [] nuevaLista = new int[arr.length + arr2.length];
		for (int i = 0; i < arr.length; i++) {
			nuevaLista[i] = arr[i]; 
		}
		for (int j = 0; j < arr2.length; j++) {
			nuevaLista[arr.length + j] = arr2[j];
		}return nuevaLista;
		
	}
	
	static int[] agregarAlFinal(int[] arr, int elem) {
		int [] nuevoArreglo = new int[arr.length + 1];
		
		for(int i = 0; i < arr.length; i++) {
			nuevoArreglo[i] = arr[i];
		}
		nuevoArreglo[arr.length] = elem;
		return nuevoArreglo;
	}
	
	static int[] sinRepetidos(int[] arr) {
		int[] arregloTemporal = new int[arr.length];
		int cantUnicos = 0;
		
		for (int i = 0; i < arr.length; i++) {
			boolean yaExiste = false;
			for(int j = 0; j < cantUnicos; j++) {
				if (arregloTemporal[j] == arr[i]) {
					yaExiste = true;
				}
			}
			if(!yaExiste) {
				arregloTemporal[cantUnicos] = arr[i];
				cantUnicos = cantUnicos++;
			}
		}
		int[] resultado = new int[cantUnicos];
		for (int i = 0; i < cantUnicos; i++) {
			resultado[i] = arregloTemporal[i];
		}
		return resultado;
	}
}
