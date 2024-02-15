package cadenas;

public class Ejercicio08 {

	public static void main(String[] args) {

		// var
		// frase a comprobar si es palíndroma o no
		String frase = "Dabale arroz a la zorra el abad";

		// comprueba la función que comprueba si la palabra es palíndroma
		System.out.println(esPalindroma(frase) ? "Es palíndroma." : "No es palíndroma.");
	}

	/**
	 * Le da la vuelta a una frase para comprobar si es palíndroma o no
	 * 
	 * @param frase | String que se comprobará
	 * @return esPalindroma | booleano que sirve de comprobante para saber si es
	 *         palíndroma o no, true si lo es false sino
	 */
	public static boolean esPalindroma(String frase) {
		String fraseSinEspacios;
		String fraseReves = "";
		boolean esPalindroma = false;

		//primero le quitamos los espacios a la frase
		fraseSinEspacios = frase.replace(" ", "");
		// recorre la frase para montar la frase del reves
		for (int i = fraseSinEspacios.length() - 1; i >= 0; i--) {
			fraseReves += fraseSinEspacios.charAt(i);
		}

		//comprueba que las dos frases sean iguales
		if (fraseReves.equalsIgnoreCase(fraseSinEspacios)) {
			esPalindroma = true;
		}

		return esPalindroma;
	}
}
