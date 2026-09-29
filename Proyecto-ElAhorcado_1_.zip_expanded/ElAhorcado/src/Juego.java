import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Juego {

	public static void main(String[] args) 
	{
		String palabra = palabraRandom();
		System.out.println(palabra);
		
		
		
	}

	/**
	 * Devuelve una palabra del diccionario elegida alazar
	 */
	private static String palabraRandom() 
	{
		String ret = null;
		try {
			Scanner arch = new Scanner(new File("lemario.txt"));
			int k = (int) (Math.random()*80000);

			while (k > 0)
			{
				ret = arch.next();

				k--;
			}
		} 
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}

		String acentos = "αινσϊ";
		String vocales = "aeiou";
		for (int i = 0; i < acentos.length(); i++)
			ret = ret.replace(acentos.charAt(i), vocales.charAt(i));
		
		return ret;
	}

}
