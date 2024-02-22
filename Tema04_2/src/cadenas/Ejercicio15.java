package cadenas;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio15 {
	
	//método random
	static Random rand = new Random();
	//escaner
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		//var
		//palabra que se desordenará
		String palabra;
		//palabra que introduce el usuario
		String palabraJugador;
		//anagrama
		String anagrama;
		
		//primero el j1 introduce una palabra que luego tendrá que adivinar el j2
		System.out.println("J1, introduce una palabra: ");
		palabra = sc.next();
		
		//ahora se le da una pista al j2 mediante un anagrama de la palabra de j1
		//bucle hasta que el j2 adivine la palabra
		
		do {
			anagrama = String.valueOf(desordena(palabra.toCharArray()));
			
			System.out.println("Pista: " +  anagrama);
			
			System.out.println("¿Qué palabra introdujo J1?");
			palabraJugador = sc.next();
				
		}while(!palabraJugador.equalsIgnoreCase(palabra));
	
		//si ha acertado le sale un mensaje
		System.out.println("Olee");

		sc.close();
	}
	
	/**
	 * método para desordenar las palabras
	 * @param palabra Array de una palabra
	 * @return palabra desordenada
	 */
	public static char[] desordena(char[] palabra) {
		//arrays de char
		char[] palabraDesordenada = new char[palabra.length];
		//número random
		int random;
		//contador de bucle
		int i = 0;
		
		//rellena el array del mínimo valor de char
		Arrays.fill(palabraDesordenada, Character.MIN_VALUE);
		
		//desordena palabra
		while(i<palabra.length) {
			random = rand.nextInt(0, palabra.length);
			if(palabraDesordenada[random] == Character.MIN_VALUE) {
				palabraDesordenada[random]=palabra[i];
				i++;
			}
		}
		
		return palabraDesordenada;
		
	}

}
