package cadenas;

import java.util.Arrays;

public class Ejercicio13 {

	public static void main(String[] args) {
		// var
		String palabra1 = "lobo";
		String palabra2 = "bolo";
				
	
		if(esAnagrama(palabra1, palabra2)) {
			System.out.println("Es un anagrama");
		}else {
			System.out.println("No es un anagrama");
		}
	}

	static boolean esAnagrama(String palabra1, String palabra2) {
		boolean anagrama = false;
		char[] palabra1Array = palabra1.toCharArray();
		char[] palabra2Array = palabra2.toCharArray();

//		Arrays.sort(palabra1Array).equalsIgnoreCase(Arrays.sort(palabra2Array)
		Arrays.sort(palabra1Array);
		Arrays.sort(palabra2Array);

		if (Arrays.equals(palabra1Array, palabra2Array)) {
			anagrama = true;
		}

		return anagrama;
	}

}
