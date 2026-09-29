package recursion;

public class Recursion {
	
	public static String resto(String s) {
		if (s.isEmpty()) {
			return "";
		}return s.substring(1);
	}
	
	
	public static boolean esVocal(char c) {
		String vocales = "aeiou";
		for (int ite = 0; ite < vocales.length(); ite++) {
			if (c == vocales.charAt(ite)) {
				return true;
			}
		}return false;
	}
	
	
	public static String duplicarDesde(String s, int pos) {
		if (s.isEmpty()) {
			return "";
		}
		if (pos >= s.length()) {
			return s;
		}
		if (pos > 0) {
			return s.charAt(0) + duplicarDesde(resto(s), pos - 1);
		}else {
			return s.charAt(0) + "" + s.charAt(0) + duplicarDesde(resto(s), pos);
			}
		}
	
	
	
	public static String cambiarEn(String s, char c, int n) {
		
		if (n >= s.length()) {
			return s;
		}
		if (s.isEmpty()) {
			return s;
		}
		if (n == 0) {
			return c + s.substring(1);
		}
		return s.charAt(0) + cambiarEn(s.substring(1), c, n - 1);
		
	}
	
	
	
	public static boolean tieneMasDeNVocales(String s, int n) {
		
		if(n < 0) {
			return true;
		}
		
		if (s.isEmpty()) {
			return false;
		}
		if (esVocal(s.charAt(0))) {
			return tieneMasDeNVocales(s.substring(1), n - 1);
		} 
		return tieneMasDeNVocales(s.substring(1), n);
	}
	
	
	
	public static String eliminarCada2(String s) {
		
		if (s.isEmpty()) {
			return "";
		}
		if (s.length() == 1) {
			return ""; 
		}
		
		return s.charAt(1) + eliminarCada2(s.substring(2));
	}
}


