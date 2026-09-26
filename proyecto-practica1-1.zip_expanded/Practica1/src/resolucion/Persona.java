package resolucion;

public class Persona {
    String nombre;
    int edad;
    int DNI;
    
    public Persona(String nombre, int edad, int DNI) {
    	this.nombre = nombre;
    	this.edad = edad;
    	this.DNI = DNI;
    }
    
    public boolean masJovenQue(Persona otro) {
    	return this.edad < otro.edad;
    }
    
    boolean tocayo(Persona otro) {
    	return this.nombre.equals(otro.nombre);	
    }
    
    boolean mismaPersona(Persona otro) {
    	if (this.tocayo(otro) && this.edad == otro.edad && this.DNI == otro.DNI) {
    		return true;
    	}else {
    		return false;
    	}
    }
}

