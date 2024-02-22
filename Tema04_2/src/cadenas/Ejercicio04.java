package cadenas;

import java.util.Arrays;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		// var
		//frase que se va a ordenar alfabeticamente
		String frase = "la tarara tiene un vestido blanco de cascabeles";
		//se usa para guardar la frase en char que luego se ordenará
		String[] ordenada;
		//resultado de la frase ordenada
		String res;
		
		
		//le quita a la frase los " " y la ordena
		ordenada = frase.split(" ");
		Arrays.sort(ordenada);
		
		res = String.join(" ", ordenada);
		
		System.out.println(res);
		
//		//muestra el array
//		for(int i = 0; i<ordenada.length; i++) {
//			System.out.print(ordenada[i] + " ");
//		}
		
		
		
		
	}

}
