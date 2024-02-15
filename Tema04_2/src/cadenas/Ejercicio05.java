package cadenas;

public class Ejercicio05 {

	public static void main(String[] args) {
		
		// var
		//frase que se ordenará
		String frase = "Hola mundo";
		
		//imprime la función con la frase ordenada
		System.out.println(fraseReves(frase));
	}

	/**
	 * Ordena una frase del revés
	 * @param frase | frase que se introduce para ordenarla
	 * @return res | frase ya ordenada
	 */
	public static String fraseReves(String frase) {
		
		String res = "";
		
		//recorre un String dsde el final
		for(int i = frase.length()-1; i>=0; i--) {
			res += frase.charAt(i);
			
		}
		
		return res;
	}

}
