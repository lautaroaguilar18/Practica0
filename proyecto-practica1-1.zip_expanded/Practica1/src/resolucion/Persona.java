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
    
    public boolean tocayo(Persona otro) {
    	return this.nombre.equals(otro.nombre);	
    }
    
    public boolean mismaPersona(Persona otro) {
    	if (this.tocayo(otro) && this.edad == otro.edad && this.DNI == otro.DNI) {
    		return true;
    	}else {
    		return false;
    	}
    }
    
    static Persona masJoven(Persona[] grupo) {
    	Persona masJoven = grupo[0];
    	for (int i = 1; i < grupo.length; i++) {
    		if (grupo[i].getEdad() < masJoven.getEdad()){
    			masJoven = grupo[i];
    		}
    	}return masJoven;
    }
    
    
    static Persona buscar(Persona[] grupo, String nombre) {
    	for (int ite = 0; ite < grupo.length; ite++) {
    		if (grupo[ite].getNombre().equals(nombre)) {
    			return grupo[ite];
    		}
    	}return null;
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}

