package cadenas;

public class Ejercicio07 {

	public static void main(String[] args) {
		// var
		String frase = "Hola Hola Hola";
		String palabraBusca = "a";
		int veces;
		
		veces = numeroPalabra(frase, palabraBusca);
		System.out.println("La palabra aparece " + veces + " veces.");

	}

	/**
	 * cuenta cuantas veces aparece una palabra en una frase
	 * @param frase | frase que se introduce para contar una palabra
	 * @param palabra | palabra a buscar en el String
	 * @return repeticion | veces que se ha repetido una palabra
	 */
	public static int numeroPalabra (String frase, String palabra) {
		int repeticion = 0;
		String[] fraseArray = frase.split(" ");
		
		//recorre el array buscando la palabra y sumando al contador
		for(int i = 0; i<fraseArray.length; i++) {
			if(fraseArray[i].equalsIgnoreCase(palabra)) {
				repeticion++;
			}
		}
		
		return repeticion;
	}
}
