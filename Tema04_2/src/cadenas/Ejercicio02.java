package cadenas;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// VAR
		String contrasena = "";
		String adivina = "";
		int diferencia = 0;
		boolean ganado = false;

		// el primer usuario introduce una contraseña
		System.out.println("Introduce la contraseña:");
		adivina = sc.nextLine();

		// pregunta al otro jugador por contraseñas hasta que las dos sean iguales
		// alfabeticamente
		while (ganado == false) {

			// pide al usuario que intente adivinar la contraseña
			System.out.println("¿Cual es la contraseña?");
			adivina = sc.nextLine();

			// compara las cadenas
			diferencia = contrasena.compareTo(adivina);

			if (diferencia != 0) {
				// le dice al usuario en cuantos carácteres se ha equivocado
				System.out.println("Su cadena es menor alfabeticamente");
			} else if (diferencia == 0) {
				ganado = true;
			}
		}

		// cierre
		sc.close();
	}
}
