package cadenas;


public class Ejercicio14 {

	private static final char[] ABC = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o',
			'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

	public static void main(String[] args) {
		String frase = "En algun lugar de la mancha";
		// pasa la frase a un array de chars
		char[] letra = frase.toCharArray();
		// cantidad de caracteres que aparecen
		int contador;

		// recorre el array buscando cuantas veces aparece cada letra
		for (int i = 0; i < ABC.length; i++) {
			// iguala el contador a 0
			contador = 0;
			for (int j = 0; j < letra.length; j++) {
				// Condicion que incrementa el contador si los dos caracteres son iguales
				if (ABC[i] == letra[j]) {
					contador++;
				}

			}
			// si el contador es mayor a 0 aparece un string con el contador de la palabra
			if (contador == 0) {
				System.out.print("");
			} else {
				System.out.println(ABC[i] + ": " + contador + " veces");
			}
		}
	}

}
