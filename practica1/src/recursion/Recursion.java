package recursion;

public class Recursion {
	
	public static String resto(String s) {
		if (s.isEmpty()) {
			return "";
		}return s.substring(1);
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
	}

