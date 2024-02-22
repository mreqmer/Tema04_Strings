package cadenas;

public class Ejercicio10_11 {

	public static void main(String[] args) {

		// var
		// frase que se codificará
		String frase = "Paquito";
		frase = frase.toLowerCase();
		// frase convertida en array de chars
		char[] fraseArray = frase.toCharArray();
		// frase codificada
		String fraseCodificada = "";
		// frase desCodificada
		String fraseDescodificada = "";

		// codificador 1
		char[] conjunto1 = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v' };
		char[] conjunto2 = { 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's' };

		for (int i = 0; i < frase.length(); i++) {
			fraseCodificada += codifica(conjunto1, conjunto2, fraseArray[i]);

		}

		for (int i = 0; i < frase.length(); i++) {
			fraseDescodificada += descodifica(conjunto1, conjunto2, fraseCodificada.toCharArray()[i]);

		}

		System.out.println(fraseCodificada);

		System.out.println(fraseDescodificada);

	}

	/**
	 * Método para codificar una clase
	 * 
	 * @param conjunto1 caracteres que se van a codificar
	 * @param conjunto2 caraceres codificados
	 * @param c         caracter que se verifica para su codificacion
	 * @return caracter ya codificado si coincide con el conjunto 1
	 */
	public static char codifica(char conjunto1[], char conjunto2[], char c) {
		char charCodificado = c;

		// busca en el array codificador si está el caracter indicado, si lo está se
		// codifica, si no se queda igual
		for (int i = 0; i < conjunto1.length; i++) {
			if (c == conjunto1[i]) {
				charCodificado = conjunto2[i];
			}
		}

		return charCodificado;
	}

	/**
	 * Método para descodificar una clase
	 * 
	 * @param conjunto1 conjunto de caracteres codificados
	 * @param conjunto2 conjunto a descodificar
	 * @param c         caracter que se comprueba para descodificar
	 * @return character descodificado
	 */
	public static char descodifica(char conjunto1[], char conjunto2[], char c) {
		char charDescodificado = c;

		// si encuentra que algún caracter es descodificable lo descodifica si no lo
		// devuelve tal cual
		for (int i = 0; i < conjunto2.length; i++) {
			if (c == conjunto2[i]) {
				charDescodificado = conjunto1[i];
			}
		}

		return charDescodificado;

	}

}
