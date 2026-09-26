package intAobjetos;
//import java.awt.Point;
//import java.awt.Rectangle;
//import java.util.Scanner;
public class Practica {

	public static void main(String[] args) {
		//Scanner scan = new Scanner(System.in);
		//PizarraGeometrica pizarra = PizarraGeometrica.crearPizarra();
		//Rectangle r = new Rectangle(0,0,200,100);
		/*Point p1 = new Point(200,100);
		Point p2 = new Point(400,200);
		//Point p2 = new Point(r.x + r.width, r.y + r.height);
		Point puntoMedio = Funciones.puntoMedio(p1, p2);
		System.out.println(puntoMedio);*/
	
		//scan.close();
		
		int[] lista1 = {1, 5, 8, 3};
		int[] lista2 = {1, 5, 8, 5};
		
		System.out.println("La primera lista no tiene numeros repetidos? " + Arreglos.esSinRepetidos(lista1));
		System.out.println("La segunda lista no tiene numeros repetidos? " + Arreglos.esSinRepetidos(lista2));
		}
	
}

