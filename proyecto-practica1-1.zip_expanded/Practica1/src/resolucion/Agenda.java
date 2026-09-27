package resolucion;

public class Agenda {
    Persona[] contactos;
    String[] telefonos;
    
    public Agenda(int tamanio) {
    	this.contactos = new Persona[tamanio];
    	this.telefonos = new String[tamanio];
    }
    
    void guardar(Persona contacto, String telefono) {
    	for (int ite = 0; ite < contactos.length; ite++) {
    		if (contactos[ite] == null) {
    			contactos[ite] = contacto;
    			telefonos[ite] = telefono;
    			return;
    		}	
    	}
    	int tamanioNuevo = contactos.length + 1;
    	Persona[] contactoNuevo = new Persona[tamanioNuevo];
    	String[] telNuevo = new String[tamanioNuevo];
    	
    	for (int ite = 0; ite < contactos.length; ite++) {
    		contactoNuevo[ite] = contactos[ite];
    		telNuevo[ite] = telefonos[ite];
    	}
    	contactoNuevo[contactos.length] = contacto;
    	telNuevo[telefonos.length] = telefono;
    	
    	this.contactos = contactoNuevo;
    	this.telefonos = telNuevo;
    }
}

