package resolucion;

public class Main {
	
	public static void main(String[] args){
		Persona p1 = new Persona("Lautaro", 24, 43974749);
		Persona p2 = new Persona("Gabriela", 52, 23333244);
		Persona p3 = new Persona("Gustavo", 54, 21965999);
		Persona p4 = new Persona("Lautaro", 24, 43974749);
		
		System.out.println("¿p1 es mas joven que p2?: " + p1.masJovenQue(p2));
		
		
		System.out.println("¿p1 tiene el mismo nombre que p2?: " + p1.tocayo(p2));
		
		
		System.out.println("¿p1 es la misma persona que p4?: " + p1.mismaPersona(p4));

		
	}
}
