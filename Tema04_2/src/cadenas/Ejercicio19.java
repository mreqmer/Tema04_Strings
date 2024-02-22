package cadenas;

public class Ejercicio19 {

	public static void main(String[] args) {
		//string
		String frase = "Hola  buenos dias";
		//guarda el resultado de la funcion toCamelCase
		String res = toCamelCase(frase);

		System.out.println(res);

	}

	/**
	 * Pasa una cadena a camel case
	 * 
	 * @param cadena String que se intoduce para ser convertido
	 * @return String convertido a camel
	 */
	public static String toCamelCase(String cadena) {
		// se iguala a la cadena introducida para ir modificandola
		String camelCase = cadena.toLowerCase();
		// auxiliar tipo char
		char auxChar;
		// recorre el String buscando espacios y convirtiendo los char de despues en
		// mayus
		for (int i = 0; i < camelCase.length(); i++) {
			if (camelCase.charAt(i) == ' ') {
				auxChar = Character.toUpperCase(camelCase.charAt(i + 1));
				camelCase = camelCase.replace(camelCase.charAt(i + 1), auxChar);
			}
		}
		// una vez terminado el bucle quita todos los espacios
		camelCase = camelCase.replace(" ", "");

		return camelCase;
	}
}
