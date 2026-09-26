package intAobjetos;
import java.awt.Point;
import java.awt.Rectangle;
public class Funciones {
	// 1)
	public static double distancia(Point p1, Point p2) {
		return Math.sqrt( (p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y) );
	}
	
	// 2)
	
	public static double diagonal(Rectangle r) {
		Point p1 = new Point(r.x,r.y);
		Point p2 = new Point(r.x + r.width, r.y + r.height);
		return Funciones.distancia(p1, p2);
	}
	
	// 3)
	
	public static Point centro(Rectangle r) {
		return new Point(r.x + r.width/2, r.y + r.height/2);
	}
	
	// 4)
	
	public static boolean estáDentro(Point p, Rectangle r) {
		return (p.x > r.x && p.x < r.x + r.width && p.y > r.y && p.y < r.y + r.height);
	}
	
	// 5)
	
	public static Point puntoMedio(Point p1, Point p2) {
		return new Point((p1.x + p2.x)/2 , (p1.y + p2.y)/2);
	}
	
	// 6)
	
	public static Rectangle encuadrar(Rectangle r1, Rectangle r2) {
		int x = Math.min(r1.x, r2.x);
		int y = Math.min(r1.y, r2.y);
		int ancho = Math.max(r1.x + r1.width, r2.x + r2.width) - x;
		int alto = Math.max(r1.y + r1.height , r2.y + r2.height) - y;
		return new Rectangle(x,y,ancho,alto);
	}
	
	// 7)
	public static boolean estaContenido(Rectangle r1, Rectangle r2) {
		return estáDentro(new Point(r1.x,r1.y), r2) && estáDentro(new Point(r1.x + r1.width, r1.y + r1.height), r2);
	}
	
	// 8)
	
	public static Rectangle intersección(Rectangle r1, Rectangle r2) {
		int x = Math.max(r1.x,r2.x);
		int y = Math.max(r1.y,r2.y);
		int ancho = Math.min(r1.x + r1.width,r2.x + r2.width) - x;
		int alto = Math.min(r1.y + r1.height,r2.y+r2.height) - y;
		if(ancho < 0 || alto < 0) {
			return null;
		}
		return new Rectangle(x,y,ancho,alto);
	}

}
