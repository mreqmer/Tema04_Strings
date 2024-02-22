package cadenas;

import java.util.Scanner;

public class Ejercicio06 {
	
	// palabra para dejar de preguntar palabras
	static final String FINALIZACION = "fin";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// var
		// palabra que introduce el usuario
		String palabra;
		// cadena que se va montando palabra a palabra
		String frase = "";

		System.out.println("Introduce la palabra: ");
		palabra = sc.next();

		// pide palabras para montar la frase hasta que se introduce fin
		while (!palabra.equalsIgnoreCase(FINALIZACION)) {
			// añade la palabra a la frase
			frase += palabra + " ";
			// pide otra palabra
			System.out.println("Introduce la palabra: ");
			palabra = sc.next();

		}
		//muestra la frase
		System.out.println(frase);
		//cierre
		sc.close();
	}

}
