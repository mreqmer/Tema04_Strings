package cadenas;

import java.util.Arrays;

public class Ejercicio20 {

	public static void main(String[] args) {
		//var
		//palabra a dividir
		String palabra = "externocleidomastoideo";
		//veces en las que se va a dividir la palabra
		int divisiones = 3;
		//guarda el resultado de la función divide
		String[] res;
		
		res = divide(palabra, divisiones);
		
		
		System.out.println(Arrays.toString(res));
	}
	
	/**
	 * método que divide una palabra en una determinada cantidad de caracteres
	 * @param palabra String 
	 * @param divisiones número de veces que se divide una palabra
	 * @return array de String con palabras divididas
	 */
	private static String[] divide (String palabra, int divisiones) {
		
		int longitudArray =(palabra.length()/ divisiones)+1;
		String[] dividida = new String[longitudArray];
		int inicio;
		int fin;
		
		for(int i = 0; i<longitudArray; i++){
			inicio = divisiones * i;
			fin = (i+1)* divisiones;
			if(fin<palabra.length()) {
				dividida[i] = palabra.substring(inicio, fin);
			}else {
				dividida[i] = palabra.substring(inicio, palabra.length());
			}
		
		}
		
		return dividida;
		
	}

}
