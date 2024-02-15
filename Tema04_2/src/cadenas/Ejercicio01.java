package cadenas;

public class Ejercicio01 {
	/**
	 * Método main
	 * @param args
	 */
	public static void main(String[] args) {

		//Contiene una cadena

		String cadena1 = "Hola, buenos días";

		//Contiene una cadena

		String cadena2 = "Hola";
		
		//devuelve la cadena más corta
		System.out.println("La cadena más corta es la cadena " + masLargo(cadena1, cadena2));

	}

	/**
	 * Busca la cadena más corta entre dos
	 * 
	 * @param frase1 |String
	 * @param frase2 |String
	 * @return 1 o 2 | 1 si el primer String introducido es el más corto, 2 si es
	 *         segundo es el más corto
	 */
	static public int masLargo(String frase1, String frase2) {
		//Guarda los caracteres del primer String
		int caracteres1 = 0;
		//Guarda los caracteres del segundo String
		int caracteres2 = 0;
		
		//iguala las variables a la longitud de los Strings
		caracteres1 = frase1.length();
		caracteres2 = frase2.length();

		return (caracteres1 < caracteres2) ? 1 : 2;

	}

}
