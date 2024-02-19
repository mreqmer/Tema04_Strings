package cadenas;

public class Ejercicio10 {

	public static void main(String[] args) {

		// var
		// frase que se codificará
		String frase = "Paquito";
		frase = frase.toLowerCase();
		// frase convertida en array de chars
		char[] fraseArray = frase.toCharArray();
		//frase codificada
		String fraseCodificada = "";
		//frase desCodificada
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

	public static char codifica(char conjunto1[], char conjunto2[], char c) {
		char charCodificado = c;

		for (int i = 0; i < conjunto1.length; i++) {
			if (c == conjunto1[i]) {
				charCodificado = conjunto2[i];
			}
		}

		return charCodificado;
	}
	
	public static char descodifica(char conjunto1[], char conjunto2[], char c) {
		char charDescodificado = c;

		for (int i = 0; i < conjunto2.length; i++) {
			if (c == conjunto2[i]) {
				charDescodificado = conjunto1[i];
			}
		}

		return charDescodificado;
		
	}
	
}
