package com.liceolapaz.MASS;

import java.util.Random;
import java.util.Scanner;

public class JuegoManos {

	//private static final String j = null;

	public static void main(String[] args) {
		/*
		 * Escribir menú 
		 * 1. Tijeras corta papel 
		 * 2. Papel envuelve roca 
		 * 3. Roca rompe Lagarto 
		 * 4. Lagart envenena Spock 
		 * 5. Spock aplasta Tijeras 
		 * 6. Tijeras decapita Lagarto 
		 * 7. Lagarto come Papel 
		 * 8. Papel desaprueba Spock 
		 * 9. Spock vaporiza Roca 
		 * 10. Rock rompe Tijeras
		 */

		escribirMenu();

		elijaJuego();
// Leer decisión y guardarla en una variable

		int juego = leerJuego(); /*jugamos o no
										 * definimos varaible forma para que lea esa decisión de forma. Crea método y
										 * hacer una scaner
										 */
		int menuJuego = leerJuego();
		if (juego == 1) { // si la forma es 1... entonces...juega
			jugar(1, 2, 3, 4, 5);
		}
		
		switch (menuJuego) { // if simplificado
		case 1:
			jugar(1, 2, 3, 4, 5 );
			System.out.println("1. Tijeras corta papel\r\n");
			//break;

		case 2:
			jugar(1, 2, 3, 4, 5);
			System.out.println("2. Papel envuelve roca");
			break;

		case 3:
			jugar(1, 2, 3, 4, 5);
			System.out.println("3. Roca aplasta Lagarto");
			break;

		case 4:
			jugar(1, 2, 3, 4, 5);
			System.out.println("4. Lagarto envenena Spock");
			break;

		case 5:
			jugar(1, 2, 3, 4, 5);
			System.out.println("5. Spock rompe Tijeras");
			break;

		}
	}

	// ------------------------------------------------------------------------------

	private static void jugar( int piedra, int papel, int tijera, int lagarto, int Spock) {
		int numForma = 5;// Dependiendo de la opción hacer lo que sea

		int formaAleatorio = generarFomaAleatorio(piedra, papel, tijera, lagarto, Spock);// Generar metodo forma random. Genera forma aleatoria y lo guarda en una variable.
														
		System.out.println("ASUS juega: " + formaAleatorio);
		String comparacion = "";
	}

	private static int generarFomaAleatorio(int piedra, int papel, int tijera, int lagarto, int spock) {
		Random rand = new Random();
		return rand.nextInt(4)+1;
	}

	private static int leerJuego() { // lee la decisión
		Scanner scan = new Scanner(System.in); // lee/scanea la decisión que hemos tomado
		int decision = scan.nextInt(); // vuelve a variable forma y hace siguiente scaneado
		return decision; // volvemos a variable decision
	}

	private static void elijaJuego() { // Opción de selección
		System.out.println("Decida:\r\n" + "1.piedra\r\n" + "2.papel\r\n" + "3.tijera\r\n" + "4.lagarto\r\n" + "5.Spock\r\n");
	}

	private static void escribirMenu() { // Escribimos menú principal
		System.out.println("1.Jugar\r\n" + "0. Salir\r\n"); // "r\n" Para escribir las opciones en columna
	}

}
