package cadenas;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio16 {

	static Random rand = new Random();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// var
		// palabra que se desordenará
		String palabra;
		// palabra que introduce el usuario
		String palabraJugador;
		// anagrama
		String anagrama;
		//aciertos de letras en la palabra
		int aciertos;

		// primero el j1 introduce una palabra que luego tendrá que adivinar el j2
		System.out.println("J1, introduce una palabra: ");
		palabra = sc.next();

		// ahora se le da una pista al j2 mediante un anagrama de la palabra de j1
		// bucle hasta que el j2 adivine la palabra

		do {
			anagrama = String.valueOf(desordena(palabra.toCharArray()));

			System.out.println("Pista: " + anagrama);

			System.out.println("¿Qué palabra introdujo J1?");
			palabraJugador = sc.next();
			
			//le dice al jugador cuantos aciertos tiene
			aciertos = aciertos(palabraJugador.toCharArray(), palabra.toCharArray());
			System.out.println("Usted tiene " + aciertos + " aciertos");

		} while (!palabraJugador.equalsIgnoreCase(palabra));

		// si ha acertado le sale un mensaje
		System.out.println("Olee");

	}

	/**
	 * método para desordenar las palabras
	 * 
	 * @param palabra Array de una palabra
	 * @return palabra desordenada
	 */
	public static char[] desordena(char[] palabra) {
		char[] palabraDesordenada = new char[palabra.length];
		int random;
		// contador de bucle
		int i = 0;

		Arrays.fill(palabraDesordenada, Character.MIN_VALUE);

		while (i < palabra.length) {
			random = rand.nextInt(0, palabra.length);
			if (palabraDesordenada[random] == Character.MIN_VALUE) {
				palabraDesordenada[random] = palabra[i];
				i++;
			}
		}

		return palabraDesordenada;
	}
	
	/**
	 * método para comprobar aciertos entre dos palabras
	 * @param palabra1 
	 * @param palabra2
	 * @return número de aciertos
	 */
	public static int aciertos(char[]palabra1, char[]palabra2 ) {
		int aciertos=0;
		
			for(int i = 0; i<palabra1.length; i++) {
				for(int j = 0; j<palabra1.length;j++) {
					if(palabra1[i] == palabra2[j]) {
						aciertos++;
						break;
					}
				}
			}
		return aciertos;
	}

}