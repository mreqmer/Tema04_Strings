package cadenas;

public class Ejercicio09 {

	public static void main(String[] args) {
		//var
		//frase a traducir
		String frase = "Javalín, javalón buenos dias javalén, len, len";
		
		//devuelve la frase traducida
		System.out.println(traductor(frase));	
		
	}

	/**
	 * traduce las frases de los dialectos java
	 * @param frase | frase a traducir
	 * @return frase traducida
	 */
	public static String traductor (String frase) {
		String fraseTraducida = "";
		
		//comprueba que dialecto se usa en la frase, y sis e usa alguno se traduce
		if(frase.startsWith("Javalín, javalón")) {
			fraseTraducida = frase.substring(17);
		}else if(frase.endsWith("javalén, len, len")) {
			fraseTraducida = frase.substring(0, frase.length()-17);
		}else {
			fraseTraducida = frase;
		}
		
		return fraseTraducida;
	}
}
