package cadenas;

import java.util.Arrays;

public class Ejercicio13 {

	public static void main(String[] args) {
		// var
		//palabra
		String palabra1 = "lobo";
		//palabra que se comprueba si es anagrama o no de la otra
		String palabra2 = "bolo";

		// dependiendo de si el booleano al llamar al método para saber si es anagrama o
		// no devuelve un mensaje u otro
		if (esAnagrama(palabra1, palabra2)) {
			System.out.println("Es un anagrama");
		} else {
			System.out.println("No es un anagrama");
		}
	}

	/**
	 * Comprueba si una palabra es anagrama de otra
	 * 
	 * @param palabra1 palabra original
	 * @param palabra2 palabra que se compara con la original para saber si es
	 *                 anagrama
	 * @return booleano, true si es anagrama false si no
	 */
	static boolean esAnagrama(String palabra1, String palabra2) {
		//booleano que controla si es anagrama o no
		boolean anagrama = false;
		//arrays de char de palabra1
		char[] palabra1Array = palabra1.toCharArray();
		//arrays de char de palabra2
		char[] palabra2Array = palabra2.toCharArray();

		// ordena los dos array
		Arrays.sort(palabra1Array);
		Arrays.sort(palabra2Array);

		// si son iguales el boleeano pasa a true
		if (Arrays.equals(palabra1Array, palabra2Array)) {
			anagrama = true;
		}

		return anagrama;
	}

}
